//
// var extents = {
//     tieling: [121.683328, 41.840331, 126.582710, 43.573067],
//     huludao: [118.172417, 39.834530, 122.336235, 41.369228],
//     chaoyang: [117.205270, 40.391405, 123.074377, 42.504821],
//     panjin: [120.835854, 40.610362, 123.252882, 41.494596],
//     yingkou: [120.694250, 39.753728, 124.190971, 41.048150],
//     jinzhou: [119.431423, 40.729618, 123.581508, 42.211277],
//     dandong: [122.309634, 39.673381, 126.586062, 41.213798],
//     benxi: [123.398631, 40.740022, 125.936511, 41.637172],
//     fushun: [122.925499, 41.209812, 126.512294, 42.482913],
//     anshan: [120.654886, 40.025895, 125.149073, 41.654445],
//     liaoyang: [121.430973, 40.460256, 125.309147, 41.800736],
//     fuxin: [119.195495, 41.535575, 124.155844, 43.299593],
//     shenyang: [120.344180, 41.038634, 126.162792, 43.148180]
// };
// initMap();
// initList()
//
//
// var map, layer, graphicLayer, graphic, featureLayer, PicMarkerSymbol, infotem, grap, poi, TexSymbol;
// var myrole = $("#myRole").val();
// var html = "";
// var bigtmp;
// var allDataGlobal;
// var histogramgraph;
//
//
// function initList() {
//     var username = $('.username').text();
//     var json = {
//         "username": username,
//         "tjnf": "2014"
//     };
//     $('#jsonInput').val(JSON.stringify(json));
//     if($('#jumpOrNot').text()=="1"){
//         $.ajax({
//             type: "POST",
//             dataType: "html",
//             async: false,
//             url: "rest/qmp/search",
//             data: json,
//             success: function (data) {
//                 $('#listAll').html(data);
//             }
//         });
//     }
// }
//
// function initMap() {
//     require([
//         "esri/map",
//         "esri/layers/ArcGISDynamicMapServiceLayer",
//         "esri/geometry/Point",
//         "esri/SpatialReference",
//         "esri/symbols/PictureMarkerSymbol",
//         "esri/graphic",
//         "esri/geometry/Extent",
//         "esri/InfoTemplate",
//         "esri/layers/FeatureLayer",
//         "esri/symbols/TextSymbol",
//         "esri/layers/LabelClass"
//     ], function (Map,
//                  ArcGISDynamicMapServiceLayer,
//                  Point,
//                  SpatialReference,
//                  PictureMarkerSymbol,
//                  Graphic,
//                  Extent,
//                  InfoTemplate,
//                  FeatureLayer,
//                  TextSymbol,
//                  LabelClass) {
//         PicMarkerSymbol = PictureMarkerSymbol;
//         TexSymbol = TextSymbol;
//         infotem = InfoTemplate;
//         grap = Graphic;
//         poi = Point;
//         var extent = new Extent(117.309229, 39.137731, 129.957720, 43.380153);
//         map = new Map("map", {
//             "spatialReference": {
//                 "wkid": 4326
//             },
//             logo: false,
//             extent: extent,
//             showLabels: true,
//             zoom: 12,
//             maxZoom: 16
//         });
//
//         var layerUrl = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer/8";
//         featureLayer = new esri.layers.FeatureLayer(layerUrl, {
//             mode: esri.layers.FeatureLayer.MODE_SNAPSHOT,
//             outFields: ["*"],
//             hasAttributionData: true
//         });
//         map.addLayer(featureLayer, 100);
//
//         var layerUrl_2 = "http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer/5";
//         featureLayer_2 = new esri.layers.FeatureLayer(layerUrl_2, {
//             mode: esri.layers.FeatureLayer.MODE_SNAPSHOT,
//             outFields: ["*"],
//             hasAttributionData: true
//         });
//         map.addLayer(featureLayer_2, 2);
//
//         $.ajax({
//             type: "POST",
//             dataType: "json",
//             async: false,
//             url: "rest/controlunit/userForMap",
//             success: function (data) {
//                 var result = decodeURIComponent(data.result);
//                 //filterArcGISDynamicMapServiceLayer(result);
//                 featureLayer.setDefinitionExpression(result);
//             }
//         });
//
//         layer = new ArcGISDynamicMapServiceLayer("http://localhost:6080/arcgis/rest/services/liaoheliuyu/MapServer");
//         layer.setVisibleLayers([0,9]);
//         map.addLayer(layer, 0);
//         graphicLayer = new esri.layers.GraphicsLayer();
//         map.addLayer(graphicLayer);
//         var lon = "";
//         var lat = "";
//         attrs = "";
//         var username = $('.username').text();
//
//         //判断用户所代表的城市
//         $.ajax({
//             type: "POST",
//             url: "rest/qmp/getInitialExtent",
//             data: {
//                 "username": username
//             },
//             success: function (res) {
//                 if (res !== '') {
//                     var result = res.split(",");
//                     var extent = new Extent(parseFloat(result[0]), parseFloat(result[1]), parseFloat(result[2]), parseFloat(result[3]));
//                     map.setExtent(extent)
//                 }
//             }
//         });
//
//         var citylist = "";
//         polldata = null;
//         $.ajax({
//             type: "post",
//             url: "rest/qmp/totalpoll",
//             data: {
//                 "youkong": 0
//             },
//             success: function (result) {
//                 polldata = result.slice(0);
//             }
//         });
//         if($("#jumpOrNot").text()=="1"){
//             $.ajax({
//                 type: "POST",
//                 url: "rest/qmp/searchAllQmp",
//                 data: {
//                     "username": username,
//                     "tjnf": "2014"
//                 },
//                 success: function (allData) {
//                     allDataGlobal = allData;
//                     for (var i = 0; i < allData.length; i++) {
//                         if (myrole == 1 || myrole == "admin")
//                             citylist += allData[i].locCity + "、";
//                         else if (myrole == 2 || myrole == 3)
//                             citylist += allData[i].locCounty + "、";
//
//                         lon = allData[i].locLonD + (allData[i].locLonS / 60 + allData[i].locLonM) / 60;
//                         lat = allData[i].locLatD + (allData[i].locLatS / 60 + allData[i].locLatM) / 60;
//                         attrs = {
//                             "id": allData[i].id,
//                             "watershed": allData[i].watershed,
//                             "riverName": allData[i].riverName,
//                             "riverLevel": allData[i].riverLevel,
//                             "riverTo": allData[i].riverTo,
//                             "sectionName": allData[i].sectionName,
//                             "sectionProperty": allData[i].sectionProperty,
//                             "locProvince": allData[i].locProvince,
//                             "locCity": allData[i].locCity,
//                             "locCounty": allData[i].locCounty,
//                             "testBy": allData[i].testBy,
//                             "sectionLevel": allData[i].sectionLevel,
//                             "sectionType": allData[i].sectionType,
//                             "isUrban": allData[i].isUrban,
//                             "isAddition": allData[i].isAddition,
//                             "testFrequency": allData[i].testFrequency,
//                             "testItems": allData[i].testItems,
//                             "qualityTarget": allData[i].qualityTarget
//                         };
//
//                         point = new Point(lon, lat, map.spatialReference);
//                         var infoTemplate = new InfoTemplate("控制断面信息", html);
//                         var symbol1 = new PictureMarkerSymbol("app/img/qmp5rep.png", 10, 10);
//                         graphic = new Graphic(point, symbol1, attrs, infoTemplate);
//                         var value = $("#count_source").val();
//                         var histogramsymbol = new PictureMarkerSymbol("app/img/histogram_orange.png", 6, 23);
//                         histogramsymbol.setOffset(-10, 18);
//                         histogramgraph = new Graphic(point, histogramsymbol, attrs);
//                         graphicLayer.add(graphic);
//                         //graphicLayer.add(histogramgraph);
//                     }
//                     $('#city').val(citylist);
//                     list_city(citylist);
//
//                 }
//             });
//         }
//
//     });
//
//
// }
//
//
//
//
//
// $('#map').css({
//     'height': '470px',
//     'width': '100%'
// });
//
//
