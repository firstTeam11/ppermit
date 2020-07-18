// All material copyright ESRI, All Rights Reserved, unless otherwise specified.
// See http://js.arcgis.com/3.20/esri/copyright.txt for details.
//>>built
define("esri/renderers/smartMapping","require module dojo/_base/array dojo/_base/lang dojo/has dojo/Deferred dojo/DeferredList dojo/promise/all dojo/when dojo/on ../kernel ../Color ../numberUtils ../promiseList ../lang ../styles/type ../styles/size ../styles/choropleth ../styles/heatmap ../styles/predominance ../symbols/SimpleMarkerSymbol ../symbols/SimpleLineSymbol ../symbols/SimpleFillSymbol ./UniqueValueRenderer ./ClassBreaksRenderer ./HeatmapRenderer ./BlendRenderer ./utils dojo/i18n!../nls/jsapi".split(" "),
function(Z,ta,r,D,ua,v,H,va,S,wa,xa,x,I,ya,za,aa,K,L,ba,T,Aa,U,Ba,Ca,M,Da,Ea,z,Fa){function k(a,c){a.reject(Error(c))}function ca(a,c){if(a.loaded)c.call();else wa.once(a,"load",c)}function w(a,c,b,d){var e;switch(b){case "point":e=new Aa;e.setColor(c);e.setSize(null!=d?d:a.size);c=new U;c.setColor(a.outline.color);c.setWidth(a.outline.width);e.setOutline(c);break;case "line":e=new U;e.setColor(c);e.setWidth(null!=d?d:a.width);break;case "polygon":e=new Ba,e.setColor(c),c=new U,c.setColor(a.outline.color),
c.setWidth(a.outline.width),e.setOutline(c)}return e}function E(a){a=a.geometryType;"esriGeometryPoint"===a||"esriGeometryMultipoint"===a?a="point":"esriGeometryPolyline"===a?a="line":"esriGeometryPolygon"===a&&(a="polygon");return a}function V(a,c){var b=a.scheme;b=b?aa.cloneScheme(b):(b=aa.getSchemes({theme:a.theme||"default",basemap:a.basemap,geometryType:c}))&&b.primaryScheme;return b}function da(a,c){return a.label<c.label?-1:a.label>c.label?1:0}function ea(a,c){return a.value<c.value?-1:a.value>
c.value?1:0}function Ga(a,c){var b=c.count-a.count;0===b&&(b=da(a,c));return b}function Ha(a,c){var b=c.count-a.count;0===b&&(b=ea(a,c));return b}function Ia(a,c,b){var d;D.isFunction(c)?d=c:"count"===c?(d=Ha,b&&b.codedValues&&(d=Ga)):"value"===c&&(d=ea,b&&b.codedValues&&(d=da));d&&a.sort(d)}function fa(a,c,b){var d=b.layer,e=b.field,g=D.isFunction(e),f=e&&!g?d.getField(e):null,h=f?d.getDomain(f.name):null,n,l=-1,p,k=null==b.numTypes?10:-1===b.numTypes?a.length:b.numTypes,g=null==b.showOthers?!0:
b.showOthers,m=null==b.sortBy?"count":b.sortBy,t=b&&b.labelCallback,u=E(d),q=V(b,u),d=new Ca(null,e),e=b.predominanceScheme,v=b.useSizeInfo,x,y;if(e){var F=(x="polygon"===u)&&v,A=e.sizeInfo,v=v?x?A.marker:A:null;if(A=F&&A?A.background:null)d.backgroundFillSymbol=w(A,A.color,"polygon");x=y=x?F?v.size:null:"line"===u?e.width:e.size;q=e;u=F?"point":u}var J={domain:h,fieldInfo:f};r.forEach(a,function(a,c){J.value=a.value;a.label=z.createUniqueValueLabel(J);t&&(a.label=t(a));null===a.value&&(l=c)});-1<
l&&(p=a.splice(l,1)[0]);Ia(a,m,h);f&&"esriFieldTypeDate"===f.type&&(J.dateFormatInterval=z.calculateDateFormatInterval(r.map(r.filter(a,function(a,c){return c<k}),function(a){return a.value})));n=B.createColors(q.colors,a.length);r.forEach(a,function(a,c){J.value=a.value;a.label=z.createUniqueValueLabel(J);t&&(a.label=t(a));a.symbol=w(q,n[c],u,y)});b.valueExpression&&(d.setValueExpression(b.valueExpression),d.valueExpressionTitle=b.valueExpressionTitle);d.legendOptions=b.legendOptions;n=B.createColors(q.colors,
k);for(f=0;f<k;f++)(h=a[f])&&d.addValue({value:h.value,label:h.label,symbol:w(q,n[f],u,y)});g&&(d.defaultSymbol=w(q,q.noDataColor,u,x),d.defaultLabel=G.other);p&&(p.symbol=w(q,q.noDataColor,u,x),a.push(p));c&&c.widthInfo&&d.setVisualVariables([c.widthInfo]);return{renderer:d,uniqueValueInfos:a,othersStartIndex:d.infos.length===a.length?-1:d.infos.length,scheme:e?T.cloneScheme(e):V(b,u)}}function N(a,c,b){var d=a.scheme;d=d?L.cloneScheme(d):(d=L.getSchemes({theme:b||a.theme||"high-to-low",basemap:a.basemap,
geometryType:c}))&&d.primaryScheme;return d}function W(a,c){var b=a.avg,d=b-a.stddev,e=b+a.stddev;d<a.min&&(d=a.min);e>a.max&&(e=a.max);c&&(b=d+(e-d)/2);e=I.round([d,e],{strictBounds:!0});d=e[0];e=e[1];e=[d,d+(b-d)/2,b,b+(e-b)/2,e];return I.round(e,{strictBounds:!0})}function Ja(a,c,b){var d=(c-a)/(b-1),e,g=[a];for(e=1;e<=b-2;e++)g.push(a+e*d);g.push(c);return I.round(g,{strictBounds:!0})}function O(a,c,b,d){var e,g;a=a.statisticsPlugin.getSuggestedDataRange({statistics:c,isDate:b});a.defaultStatistics?
(e=a.min,g=a.max):!d||null!=c.avg&&c.stddev||(e=c.min,g=c.max);return null!=e?[e,g]:null}function ga(a,c,b,d,e){var g=null==d.useDefaultStatistics?!0:d.useDefaultStatistics;if(!a||a.count||g){var f=d.layer,h=d.field,n=D.isFunction(h),l=(n=h&&!n?f.getField(h):null)&&"esriFieldTypeDate"===n.type,n=E(f),p=N(d,n),C=d.semiContinuous,m,t,u,q=c&&c.classBreakInfos,v=q&&q.length,w=c?v:5;if(p){var y=-1<p.id.indexOf("seq-"),F=c&&y?ha(p,{length:w}):B.createColors(p.colors,w);if(F.length<w)k(e,"smartMapping.createColorInfo: not enough colors in the scheme.");
else{if(c){m=[];var A;1===v?(t=[q[0].minValue,q[0].maxValue],m=[0,1],A=B.createColors(F,w)[0],u=[A,new x(A)]):C?(t=[],u=[],r.forEach(q,function(a,c){var d=.1*(a.maxValue-a.minValue);0===c?t.push(a.minValue):t.push(a.minValue+d);c===v-1?t.push(a.maxValue):t.push(a.maxValue-d);A=new x(F[c]);u.push(A);u.push(new x(A));m.push(2*c);m.push(2*c+1)})):(t=r.map(q,function(a,c){m.push(c);return(a.minValue+a.maxValue)/2}),u=B.createColors(F,w));t=I.round(t,{strictBounds:!0})}else t=(g=g?O(f,a,l,!0):null)?Ja(g[0],
g[1],5):W(a,y),m=[0,2,4],u=B.createColors(F,w);b={type:"colorInfo",field:h,valueExpression:d.valueExpression,valueExpressionTitle:d.valueExpressionTitle,normalizationField:b,stops:z.createColorStops({values:t,isDate:l,dateFormatOptions:l?z.timelineDateFormatOptions:null,colors:u,labelIndexes:m}),legendOptions:d.legendOptions};e.resolve({colorInfo:b,statistics:a,classBreaks:c,scheme:N(d,n)})}}else k(e,"smartMapping.createColorInfo: unable to find the specified scheme.")}else k(e,"smartMapping.createColorInfo: cannot create renderer when statistics.count is 0.")}
function ia(a,c,b,d){var e=null==b.useDefaultStatistics?!0:b.useDefaultStatistics;if(!a||a.count||e){var g=b.layer,f=b.field,h=f&&!D.isFunction(f)?g.getField(f):null,n=h&&"esriFieldTypeDate"===h.type,l=(h=b.useStdDev)?W(a):null,g=(e=e?O(g,a,n,h):null)||(h?[l[0],l[4]]:[a.min,a.max]);d.resolve({opacityInfo:{type:"opacityInfo",field:f,valueExpression:b.valueExpression,valueExpressionTitle:b.valueExpressionTitle,normalizationField:c,stops:[{value:g[0],opacity:.3},{value:g[1],opacity:.7}],legendOptions:b.legendOptions},
statistics:a,defaultStatistics:!!e})}else k(d,"smartMapping.createOpacityInfo: cannot create opacityInfo when statistics.count is 0.")}function P(a,c){var b=a.scheme;b=b?K.cloneScheme(b):(b=K.getSchemes({theme:a.theme||"default",basemap:a.basemap,geometryType:c}))&&b.primaryScheme;return b}function ja(a,c){var b;switch(c){case "point":b=[a.minSize,a.maxSize];break;case "line":b=[a.minWidth,a.maxWidth];break;case "polygon":b=[a.marker.minSize,a.marker.maxSize]}return b}function ka(a,c,b,d,e){var g=
null==d.useDefaultStatistics?!0:d.useDefaultStatistics,f=c&&[c.minSize,c.maxSize];if(!a||a.count||g){var h=d.layer,n=d.field,l=n&&!D.isFunction(n)?h.getField(n):null,p=l&&"esriFieldTypeDate"===l.type,l=E(h),C=P(d,l),f=f||ja(C,l),m=(C=d.useStdDev)?W(a):null,h=(g=g?O(h,a,p,C):null)||(C?[m[0],m[4]]:[a.min,a.max]);e.resolve({sizeInfo:{type:"sizeInfo",field:n,valueExpression:d.valueExpression,valueExpressionTitle:d.valueExpressionTitle,valueUnit:"unknown",normalizationField:b,legendOptions:d.legendOptions,
minSize:f[0],maxSize:f[1],minDataValue:h[0],maxDataValue:h[1]},statistics:a,defaultStatistics:!!g,suggestedSizeRange:c,scheme:P(d,l)})}else k(e,"smartMapping.createSizeInfo: cannot create renderer when statistics.count is 0.")}function Q(a,c,b){var d,e=[],g=1/(b+1);for(d=1;d<=b;d++)e.push(x.blendColors(a,c,g*d));return e}function la(a,c){var b=[];if(1===c)b=[a[0]];else if(2===c)b=[a[0],a[2]];else if(3===c)b=a;else{var d=c-a.length,b=d/2;0===d%2?(d=Q(a[0],a[1],b),b=Q(a[1],a[2],b)):(d=Q(a[0],a[1],Math.floor(b)),
b=Q(a[1],a[2],Math.ceil(b)));b=[a[0]].concat(d).concat([a[1]]).concat(b).concat([a[2]])}return b}function ha(a,c,b){var d,e=c.length,g=-1;b&&r.some(c,function(a,c){a.hasAvg&&(g=c);return-1<g});if(-1<g){var f=a.colors;a=g+1;c=e-g;b=f.slice(0,3);f=f.slice(2);b.reverse();b=la(b,a);f=la(f,c);b.reverse();d=[].concat(b).concat(f.slice(1))}else if((a=a.colorsForClassBreaks)&&0<a.length&&(r.some(a,function(a){a.numClasses===e&&(d=a.colors);return!!d}),!d&&(b=a[a.length-1],a=e-b.numClasses,0<a)))for(c=b.colors[b.numClasses-
1],d=b.colors.splice(0),b=1;b<=a;b++)d.push(c);d&&(d=B.createColors(d,d.length));return d}function Ka(a,c,b,d){var e=b.field,g=E(b.layer),f=null==b.showOthers?!0:b.showOthers,h=b.classificationMethod||"equal-interval",n="standard-deviation"===h,l=b.normalizationType,p,C,m,t=a.classBreakInfos;(p=N(b,g,"high-to-low"))?(C=ha(p,t))&&C.length==t.length?(m=new M(null,e),b.valueExpression&&(m.setValueExpression(b.valueExpression),m.valueExpressionTitle=b.valueExpressionTitle),m.legendOptions=b.legendOptions,
m.classificationMethod=h,m.normalizationType=l,m.normalizationField="field"===l?b.normalizationField:void 0,m.normalizationTotal="percent-of-total"===l?a.normalizationTotal:void 0,f&&(m.defaultSymbol=w(p,p.noDataColor,g),m.defaultLabel=G.other),r.forEach(t,function(a,c){m.addBreak({minValue:a.minValue,maxValue:a.maxValue,symbol:w(p,C[c],g),label:a.label})}),n||z.setLabelsForClassBreaks({classBreaks:m.infos,classificationMethod:h,normalizationType:l,round:!0}),c&&c.widthInfo&&m.setVisualVariables([c.widthInfo]),
a.renderer=m,a.scheme=N(b,g,"high-to-low"),d.resolve(a)):k(d,"smartMapping.createClassedColorRenderer: unable to find suitable colors for number of classes."):k(d,"smartMapping.createClassedColorRenderer: unable to find suitable style scheme.")}function ma(a){var c=new v,b=a.layer,d=null==a.useDefaultBreaks?!0:a.useDefaultBreaks,e=a.optimizeOutline,g=[b.statisticsPlugin.getClassBreaks(a)];e&&g.push(b.statisticsPlugin.getSuggestedOutline("object"===typeof e?e:null));(new H(g)).then(function(g){var h=
g[0];g=g[1];var f=e&&g[0]?g[1]:null;if(h[0]||d&&!b.graphics.length){var h=h[1],l=d?O(b,h?{min:h.minValue,max:h.maxValue}:{}):null;l&&(h=a.layer.statisticsPlugin.getClassBreaks(D.mixin(a,{classificationMethod:"equal-interval",numClasses:1,analyzeData:!1,minValue:l[0],maxValue:l[1],normalizationTotal:l[0]+l[1]})));S(h).then(function(a){a.defaultStatistics=!!l;c.resolve({cbResponse:a,suggestedOutline:f})}).otherwise(function(){k(c,"smartMapping: error when calculating default class breaks.")})}else k(c,
"smartMapping: error when calculating class breaks.")});return c.promise}function La(a,c,b,d){c=d||ja(a,c);a=c[0];c=(c[1]-a)/(4<=b?b-1:b);var e=[];for(d=0;d<b;d++)e.push(a+c*d);return e}function X(a,c,b,d,e){var g=d.field,f=E(d.layer),h=null==d.showOthers?!0:d.showOthers,n=d.classificationMethod||"equal-interval",l=d.normalizationType,p=a.classBreakInfos,k=P(d,f),m=La(k,f,p.length,c),t="polygon"===f,u=t?k.marker:k;c=t?k.background:null;var q;q=new M(null,g);d.valueExpression&&(q.setValueExpression(d.valueExpression),
q.valueExpressionTitle=d.valueExpressionTitle);q.legendOptions=d.legendOptions;q.classificationMethod=n;q.normalizationType=l;q.normalizationField="field"===l?d.normalizationField:void 0;q.normalizationTotal="percent-of-total"===l?a.normalizationTotal:void 0;h&&(q.defaultSymbol=w(u,u.noDataColor,t?"point":f),q.defaultLabel=G.other);c&&(q.backgroundFillSymbol=w(c,c.color,f));r.forEach(p,function(a,c){q.addBreak({minValue:a.minValue,maxValue:a.maxValue,symbol:w(u,u.color,t?"point":f,m[c]),label:a.label})});
"standard-deviation"!==n&&z.setLabelsForClassBreaks({classBreaks:q.infos,classificationMethod:n,normalizationType:l,round:!0});b&&b.widthInfo&&q.setVisualVariables([b.widthInfo]);a.renderer=q;a.scheme=P(d,f);e.resolve(a)}function Y(a){var c=a.scheme;c=c?ba.cloneScheme(c):(c=ba.getSchemes({theme:a.theme||"default",basemap:a.basemap}))&&c.primaryScheme;return c}function na(a,c,b){var d=null==c.useDefaultStatistics?!0:c.useDefaultStatistics;if(a.count||d){var e=a.fieldOffset,g=null==c.blurRadius?10:
c.blurRadius,f=null==c.minRatio?.01:c.minRatio,h=null==c.maxRatio?1:c.maxRatio,n=null==c.fadeToTransparent?!0:c.fadeToTransparent,l=Y(c).colors,p=l.length,C=(d=!a.count&&d)?[0,100]:[a.min,a.max],m=new Da;m.setBlurRadius(g);m.setField(c.field);null!=e&&m.setFieldOffset(e);m.setMinPixelIntensity(C[0]);m.setMaxPixelIntensity(C[1]);var e=l[0],t=[{ratio:0,color:new x([e.r,e.g,e.b,0])},{ratio:.01,color:new x([e.r,e.g,e.b,0])},{ratio:n?f:.01,color:e}],u=(h-f)/(p-1),l=B.createColors(l,p);r.forEach(l,function(a,
c){t.push({ratio:f+u*c,color:a})});m.setColorStops(t);b.resolve({renderer:m,statistics:a,defaultStatistics:d,scheme:Y(c)})}else k(b,"smartMapping.createHeatmapRenderer: cannot create renderer when statistics.count is 0.")}function Ma(a,c){var b=a.scheme;b=b?T.cloneScheme(b):(b=T.getSchemes({theme:a.theme||"default",basemap:a.basemap,geometryType:c}))&&b.primaryScheme;return b}function Na(a,c){var b={};r.forEach(a,function(a){var d=c.getField(a.name);b[a.name]=a.label||d&&d.alias||a.name});return function(a){return b[a.value]}}
function Oa(a){return function(c,b){var d=r.indexOf(a,c.value),e=r.indexOf(a,b.value);return d-e}}function Pa(a,c,b,d,e){var g=new v,f=a.layer;f.statisticsPlugin.getPredominantCategories({fields:c}).always(function(h){h&&h.predominantCategoryInfos||(h={predominantCategoryInfos:r.map(c,function(a){return{value:a,count:0}})});var n=fa(h.predominantCategoryInfos,e,{layer:f,valueExpression:d.valueExpression,labelCallback:Na(a.fields,f),numTypes:-1,showOthers:a.showOthers,sortBy:Oa(c),predominanceScheme:b,
useSizeInfo:a.includeSizeInfo});n.predominantCategoryInfos=n.uniqueValueInfos;delete n.uniqueValueInfos;n.source=h.source;g.resolve(n)});return g.promise}function Qa(a,c,b,d){var e=new v;B.createSizeInfo({layer:a.layer,valueExpression:d.valueExpression,sqlExpression:d.statisticsQuery.sqlExpression,sqlWhere:d.statisticsQuery.sqlWhere,scheme:b,optimizeForScale:a.optimizeForScale}).then(function(a){a.sizeInfo.legendOptions={title:G.sumOfCategories};e.resolve(a)}).otherwise(function(a){k(e,"smartMapping.createPredominanceRenderer: error when calculating statistics for visual variable(size).")});
return e.promise}function Ra(a,c,b){var d=new v;a.layer.statisticsPlugin.getFieldStatistics({valueExpression:b.valueExpression,sqlExpression:b.statisticsQuery.sqlExpression,sqlWhere:b.statisticsQuery.sqlWhere}).then(function(a){var e=null==a.avg||null==a.stddev,f=1/c.length*100,h=e?100:a.avg+1.285*a.stddev;100<h&&(h=100);f=I.round([f,h],{strictBounds:!0});d.resolve({opacityInfo:{type:"opacityInfo",valueExpression:b.valueExpression,stops:[{value:f[0],opacity:.15},{value:f[1],opacity:1}],legendOptions:{title:G.strengthOfPredominance}},
statistics:a,defaultStatistics:e})}).otherwise(function(a){k(d,"smartMapping.createPredominanceRenderer: error when calculating statistics for visual variable(opacity).")});return d.promise}function Sa(a,c,b,d){var e=E(a.layer),g=Ma(a,e);a.layer.statisticsPlugin.getPredominanceExpressions({fields:c}).then(function(e){var h=Pa(a,c,g,e.predominantCategory,b),f,l;a.includeSizeInfo&&(f=Qa(a,c,g.sizeInfo,e.size));a.includeOpacityInfo&&(l=Ra(a,c,e.opacity));ya([h,f,l]).then(function(a){var c=a[0],b=a[1],
e=a[2];a=[];if(c instanceof Error)k(d,"smartMapping.createPredominanceRenderer: unable to create unique-value renderer.");else{if(f){if(b instanceof Error){k(d,"smartMapping.createPredominanceRenderer: unable to create visual variable for symbol size.");return}a.push(z.cloneSizeInfo(b.sizeInfo));delete b.scheme;c.size=b}if(l){if(e instanceof Error){k(d,"smartMapping.createPredominanceRenderer: unable to create visual variable for symbol opacity.");return}a.push(z.cloneOpacityInfo(e.opacityInfo));
c.opacity=e}if(a.length){if(b=c.renderer.visualVariables)Array.prototype.push.apply(b,a),a=b;c.renderer.setVisualVariables(a)}d.resolve(c)}})}).otherwise(function(a){k(d,"smartMapping.createPredominanceRenderer: unable to generate expressions.")})}function oa(a,c,b){var d=a;if("string"===typeof a)(a=b.getField(a))&&"esriFieldTypeDate"===a.type&&(d=b.getFieldLabel(a.name));else if("number"===typeof a||a instanceof Date)b=-1<r.indexOf(Ta,c)?null:"date",d=z.formatDate(a,{selector:b});return d}function Ua(a,
c,b){var d=c.startTime,e=c.endTime,g=c.layer;g.statisticsPlugin.getAgeExpressions({startTime:d,endTime:e,units:a.units}).then(function(c){var h=a.units,f="ageInfo_"+h;a.legendOptions={title:za.substitute({units:h,startTime:oa(d,h,g),endTime:oa(e,h,g)},G[f])};D.mixin(a,c);b.resolve(a)}).otherwise(function(a){k(b,"smartMapping.createAgeInfo: unable to generate expressions to calculate age.")})}function pa(a,c){var b,d,e,g,f,h,n,l,k={};b=r.filter(a,function(a){d=a.name;e=d.toLowerCase();if(h=d!==c&&
-1===r.indexOf(qa,e))n=n||(-1<r.indexOf(ra,a.type)?d:null),l=l||("esriFieldTypeString"===a.type?d:null);return h});r.forEach(b,function(a){d=a.name;e=d.toLowerCase();(g=-1<r.indexOf(ra,a.type))&&(k=sa(d,e,Va,k,"number"));k.rank&&"string"!==k.fieldType||(f="esriFieldTypeString"===a.type)&&(k=sa(d,e,Wa,k,"string"))});return k.fieldName||n||l}function sa(a,c,b,d,e){var g,f=-1;g=-1;var h,f=r.indexOf(b,c);for(h=0;h<b.length;h++)if(-1<c.indexOf(b[h])){g=h;break}c=f;-1<c&&(!d.rank||d.fieldType!==e||"exact"===
d.matchType&&d.fieldType===e&&d.rank>c)?d={rank:c,matchType:"exact",fieldType:e,fieldName:a}:-1<g&&(!d.rank||d.fieldType===e&&"contains"===d.matchType&&d.rank>g)&&(d={rank:g,matchType:"contains",fieldType:e,fieldName:a});return d}var B={},R=Math.pow(2,53)-1,G=Fa.smartMapping,Xa=/(https?:)?\/\/services.*\.arcgis\.com/i,qa="id fips fid objectid _objectid __objectid x y lat long latitude longitude shape shape_length shape_leng shape_area perimeter stretched_value fnode_ tnode_ lpoly_ rpoly_ poly_ subclass rings_ok rings_nok st_length(shape) st_area(shape)".split(" "),
Va="count percent sum elevation value valore valoare total gesamt score income age expected average median size cost expenditure revenue profit growth sale quantity population price unit length width difference distance".split(" "),Wa="type name status class category code value label zone symbol color owner district group species rating score party".split(" "),ra=["esriFieldTypeInteger","esriFieldTypeDouble","esriFieldTypeSingle","esriFieldTypeSmallInteger"],Ta=["hours","minutes","seconds"],y=function(a){return Z.toAbsMid?
Z.toAbsMid(a):ta.id.replace(/\/[^\/]*$/ig,"/")+a}("../plugins/FeatureLayerStatistics");D.mixin(B,{createColors:function(a,c){var b=[],d=a.length,e;for(e=0;e<c;e++)b.push(new x(a[e%d]));return b},createTypeRenderer:function(a){var c=new v;if(!a||!a.layer||!a.field&&!a.valueExpression||!a.scheme&&!a.basemap)return k(c,"smartMapping.createTypeRenderer: missing parameters."),c.promise;var b=a.layer,d=a.optimizeOutline;b.addPlugin(y).then(function(){var e=[b.statisticsPlugin.getUniqueValues({field:a.field,
valueExpression:a.valueExpression,includeAllCodedValues:a.includeAllCodedValues})];d&&e.push(b.statisticsPlugin.getSuggestedOutline("object"===typeof d?d:null));(new H(e)).then(function(b){var e=b[0];b=b[1];b=d&&b[0]?b[1]:null;e[0]?(e=e[1],b=fa(e.uniqueValueInfos,b,a),b.source=e.source,b.partialData=e.partialData,c.resolve(b)):k(c,"smartMapping.createTypeRenderer: error when calculating unique values.")})}).otherwise(function(a){k(c,"smartMapping.createTypeRenderer: error when adding feature layer statistics plugin.")});
return c.promise},createColorInfo:function(a){var c=new v;if(!(a&&a.layer&&(a.field||a.valueExpression||a.sqlExpression)))return k(c,"smartMapping.createColorInfo: missing parameters."),c.promise;var b=a.layer,d=a.normalizationField,e=d?"field":void 0;a.statistics?ga(a.statistics,null,d,a,c):b.addPlugin(y).then(function(){var g="group-similar"===a.theme||a.scheme&&0===a.scheme.id.indexOf("group-similar/");(g?b.statisticsPlugin.getClassBreaks({field:a.field,valueExpression:a.valueExpression,classificationMethod:"natural-breaks",
numClasses:a.numGroups||5,normalizationType:e,normalizationField:d,minValue:a.minValue,maxValue:a.maxValue}):b.statisticsPlugin.getFieldStatistics({field:a.field,valueExpression:a.valueExpression,sqlExpression:a.sqlExpression,sqlWhere:a.sqlWhere,normalizationType:e,normalizationField:d,minValue:a.minValue,maxValue:a.maxValue})).then(function(b){var e,f;g?e=b:f=b;ga(f,e,d,a,c)}).otherwise(function(a){k(c,g?"smartMapping.createColorInfo: error when calculating class breaks.":"smartMapping.createColorInfo: error when calculating field statistics.")})}).otherwise(function(a){k(c,
"smartMapping.createColorInfo: error when adding feature layer statistics plugin.")});return c.promise},createColorRenderer:function(a){var c=new v;if(!(a&&a.layer&&(a.field||a.valueExpression||a.sqlExpression)))return k(c,"smartMapping.createColorRenderer: missing parameters."),c.promise;var b=a.layer,d=a.normalizationField,e=d?"field":void 0,g=a.optimizeOutline;b.addPlugin(y).then(function(){var f=[B.createColorInfo(a)];g&&f.push(b.statisticsPlugin.getSuggestedOutline("object"===typeof g?g:null));
(new H(f)).then(function(b){var h=b[0];b=b[1];b=g&&b[0]?b[1]:null;if(h[0]){var h=h[1],f=a.field,p=E(a.layer),r=null==a.showOthers?!0:a.showOthers,m=L.cloneScheme(h.scheme),f=new M(null,f);a.valueExpression&&f.setValueExpression(a.valueExpression);r&&(f.defaultSymbol=w(m,m.noDataColor,p),f.defaultLabel=G.other);f.addBreak({minValue:-R,maxValue:R,symbol:w(m,m.noDataColor,p)});f.normalizationType=e;f.normalizationField=d;p=[z.cloneColorInfo(h.colorInfo)];b&&b.widthInfo&&p.push(b.widthInfo);f.setVisualVariables(p);
c.resolve({renderer:f,colorInfo:z.cloneColorInfo(h.colorInfo),statistics:h.statistics,classBreaks:h.classBreaks,scheme:L.cloneScheme(h.scheme)})}else k(c,"smartMapping.createColorRenderer: error when calculating colorInfo.")})}).otherwise(function(a){k(c,"smartMapping.createColorRenderer: error when adding feature layer statistics plugin.")});return c.promise},createOpacityInfo:function(a){var c=new v;if(!(a&&a.layer&&(a.field||a.valueExpression||a.sqlExpression)))return k(c,"smartMapping.createOpacityInfo: missing parameters."),
c.promise;var b=a.layer,d=a.normalizationField,e=d?"field":void 0;a.statistics?ia(a.statistics,d,a,c):b.addPlugin(y).then(function(){b.statisticsPlugin.getFieldStatistics({field:a.field,valueExpression:a.valueExpression,sqlExpression:a.sqlExpression,sqlWhere:a.sqlWhere,normalizationType:e,normalizationField:d,minValue:a.minValue,maxValue:a.maxValue,features:a.features}).then(function(b){ia(b,d,a,c)}).otherwise(function(a){k(c,"smartMapping.createOpacityInfo: error when calculating field statistics.")})}).otherwise(function(a){k(c,
"smartMapping.createOpacityInfo: error when adding feature layer statistics plugin.")});return c.promise},createBlendRenderer:function(a){var c=new v,b=this,d,e=[],g={},f=[],h=[],n=a.opacityValueCombinationMethod||"avg",l={};if(!(a&&a.layer&&a.blendedFields))return k(c,"smartMapping.createBlendRenderer: missing parameters."),c.promise;a.basemap=a.basemap||"topo";e=E(a.layer);d=V({basemap:a.basemap},e);d.colors=[new x("#e60000"),new x("#0000e6"),new x("#00e600"),new x("#e67300"),new x("#a900e6")];
l.fields=[];l.normalizationField=a.normalizationField;l.blendMode=a.blendMode||"source-over";l.symbol=w(d,d.noDataColor,a.markers?"point":e);g.layer=a.layer;g.normalizationField=a.normalizationField;g.useStdDev=a.useStdDev||!1;e=r.map(a.blendedFields,function(a,c){l.fields.push({field:a,color:d.colors[c]});g.field=a;return b.createOpacityInfo(g)});va(e).then(function(b){h[0]=b[0].opacityInfo.stops[0].value;h[1]=b[1].opacityInfo.stops[1].value;r.forEach(b.slice(0,1),function(a){var c=a.opacityInfo.stops[0].value,
b=a.opacityInfo.stops[1].value;"union"===n?(h[0]=c<h[0]?c:h[0],h[1]=b>h[1]?b:h[1]):"avg"===n&&(h[0]+=a.opacityInfo.stops[0].value,h[1]+=a.opacityInfo.stops[1].value)});f[0]={value:"avg"===n?h[0]/b.length:h[0],opacity:a.minOpacity?a.minOpacity:b[0].opacityInfo.stops[0].opacity};f[1]={value:"avg"===n?h[1]/b.length:h[1],opacity:a.maxOpacity?a.maxOpacity:b[0].opacityInfo.stops[1].opacity};l.opacityStops=f;c.resolve({renderer:new Ea(l),scheme:d,opacityInfos:b})});return c.promise},createSizeInfo:function(a){var c=
new v;if(!(a&&a.layer&&(a.field||a.valueExpression||a.sqlExpression)))return k(c,"smartMapping.createSizeInfo: missing parameters."),c.promise;var b=a.layer,d=a.normalizationField,e=d?"field":void 0,g=a.optimizeForScale;a.statistics?ka(a.statistics,null,d,a,c):b.addPlugin(y).then(function(){var f=[b.statisticsPlugin.getFieldStatistics({field:a.field,valueExpression:a.valueExpression,sqlExpression:a.sqlExpression,sqlWhere:a.sqlWhere,normalizationType:e,normalizationField:d,minValue:a.minValue,maxValue:a.maxValue})];
g&&f.push(b.statisticsPlugin.getSuggestedSizeRange({optimizeForScale:!0===g?"map-scale":g}));(new H(f)).then(function(b){var e=b[0];b=g&&b[1];b=g&&b[0]?b[1]:null;e[0]?ka(e[1],b,d,a,c):k(c,"smartMapping.createSizeInfo: error when calculating field statistics.")})}).otherwise(function(a){k(c,"smartMapping.createSizeInfo: error when adding feature layer statistics plugin.")});return c.promise},createSizeRenderer:function(a){var c=new v;if(!(a&&a.layer&&(a.field||a.valueExpression||a.sqlExpression)))return k(c,
"smartMapping.createSizeRenderer: missing parameters."),c.promise;var b=a.layer,d=a.normalizationField,e=d?"field":void 0,g=a.optimizeOutline;b.addPlugin(y).then(function(){var f=[B.createSizeInfo(a)];g&&f.push(b.statisticsPlugin.getSuggestedOutline("object"===typeof g?g:null));(new H(f)).then(function(b){var f=b[0];b=b[1];b=g&&b[0]?b[1]:null;if(f[0]){var f=f[1],h=a.field,p=E(a.layer),r=null==a.showOthers?!0:a.showOthers,m=K.cloneScheme(f.scheme),t="polygon"===p,u=t?m.marker:m,m=t?m.background:null,
q="line"===p?u.noDataWidth:u.noDataSize,h=new M(null,h);a.valueExpression&&h.setValueExpression(a.valueExpression);r&&(h.defaultSymbol=w(u,u.noDataColor,t?"point":p,q),h.defaultLabel=G.other);h.addBreak({minValue:-R,maxValue:R,symbol:w(u,u.color,t?"point":p)});m&&(h.backgroundFillSymbol=w(m,m.color,p));h.normalizationType=e;h.normalizationField=d;p=[z.cloneSizeInfo(f.sizeInfo)];b&&b.widthInfo&&p.push(b.widthInfo);h.setVisualVariables(p);c.resolve({renderer:h,sizeInfo:z.cloneSizeInfo(f.sizeInfo),statistics:f.statistics,
defaultStatistics:f.defaultStatistics,suggestedSizeRange:f.suggestedSizeRange,scheme:K.cloneScheme(f.scheme)})}else k(c,"smartMapping.createSizeRenderer: error when calculating sizeInfo.")})}).otherwise(function(a){k(c,"smartMapping.createSizeRenderer: error when adding feature layer statistics plugin.")});return c.promise},createClassedColorRenderer:function(a){var c=new v,b=a.minValue,d=a.maxValue,e;if(!a||!a.layer||!a.field&&!a.valueExpression)return k(c,"smartMapping.createClassedColorRenderer: missing parameters."),
c.promise;e=null!=b&&null!=d;if(!e&&(null!=b||null!=d))return k(c,"smartMapping.createClassedColorRenderer: both minValue and maxValue are required when specifying custom data range."),c.promise;a=D.mixin({analyzeData:!e},a);a.layer.addPlugin(y).then(function(){ma(a).then(function(b){Ka(b.cbResponse,b.suggestedOutline,a,c)}).otherwise(function(a){k(c,"smartMapping.createClassedColorRenderer: error when calculating class breaks.")})}).otherwise(function(a){k(c,"smartMapping.createClassedColorRenderer: error when adding feature layer statistics plugin.")});
return c.promise},createClassedSizeRenderer:function(a){var c=new v,b=a.minValue,d=a.maxValue,e;if(!a||!a.layer||!a.field&&!a.valueExpression)return k(c,"smartMapping.createClassedSizeRenderer: missing parameters."),c.promise;e=null!=b&&null!=d;if(!e&&(null!=b||null!=d))return k(c,"smartMapping.createClassedColorRenderer: both minValue and maxValue are required when specifying custom data range."),c.promise;a=D.mixin({analyzeData:!e},a);var g=a.layer;g.addPlugin(y).then(function(){ma(a).then(function(b){a.optimizeForScale?
g.statisticsPlugin.getSuggestedSizeRange().then(function(d){X(b.cbResponse,[d.minSize,d.maxSize],b.suggestedOutline,a,c)}).otherwise(function(d){X(b.cbResponse,null,b.suggestedOutline,a,c)}):X(b.cbResponse,null,b.suggestedOutline,a,c)}).otherwise(function(a){k(c,"smartMapping.createClassedSizeRenderer: error when calculating class breaks.")})}).otherwise(function(a){k(c,"smartMapping.createClassedSizeRenderer: error when adding feature layer statistics plugin.")});return c.promise},createHeatmapRenderer:function(a){var c=
new v;if(!a||!a.layer)return k(c,"smartMapping.createHeatmapRenderer: missing parameters."),c.promise;var b=a.layer;a.statistics?na(a.statistics,a,c):b.addPlugin(y).then(function(){b.statisticsPlugin.getHeatmapStatistics(a).then(function(b){na(b,a,c)}).otherwise(function(a){k(c,"smartMapping.createHeatmapRenderer: error when calculating heatmap statistics.")})}).otherwise(function(a){k(c,"smartMapping.createHeatmapRenderer: error when adding feature layer statistics plugin.")});return c.promise},
applyHeatmapScheme:function(a){if(a&&a.renderer&&a.scheme){var c=Y({scheme:a.scheme});a=a.renderer;var b=a.colorStops,c=c.colors;if(b.length!==c.length+3)console.log("smartMapping.applyHeatmapScheme: incompatible number of colors in 'colors' and 'renderer.colorStops'.");else{var d;d=new x(c[0]);b=r.map(b,function(a){return D.mixin({},a)});b[0].color=new x([d.r,d.g,d.b,0]);b[1].color=new x([d.r,d.g,d.b,0]);b[2].color=d;for(d=3;d<b.length;d++)b[d].color=c[d-3];a.setColorStops(b)}}else console.log("smartMapping.applyHeatmapScheme: missing parameters.")},
sampleSize:500,createPredominanceRenderer:function(a){var c=new v;if(!(a&&a.layer&&a.fields&&1<a.fields.length))return k(c,"smartMapping.createPredominanceRenderer: missing parameters."),c.promise;if(5<a.fields.length)return k(c,"smartMapping.createPredominanceRenderer: too many fields. Maximum supported is 5."),c.promise;var b=a.layer;b.addPlugin(y).then(function(){var d=r.map(a.fields,function(a){return a.name});ca(b,function(){var e=b.getOutFields()||[],g=-1!==r.indexOf(e,"*"),f=a.optimizeOutline,
g=g?null:r.filter(d,function(a){return-1===r.indexOf(e,a)});b.url&&!Xa.test(b.url)?k(c,"smartMapping.createPredominanceRenderer: predominance renderer is not supported for this layer. Make sure the layer supports advanced SQL expressions and standardized queries."):g&&g.length?k(c,"smartMapping.createPredominanceRenderer: make sure the layer is configured to fetch all fields specified in parameters."):(f=f?b.statisticsPlugin.getSuggestedOutline("object"===typeof f?f:null):null,S(f).always(function(b){b&&
!b.widthInfo&&(b=null);Sa(a,d,b,c)}))})}).otherwise(function(a){k(c,"smartMapping.createPredominanceRenderer: error when adding feature layer statistics plugin.")});return c.promise},createAgeInfo:function(a){var c=new v;if(!(a&&a.layer&&a.startTime&&a.endTime))return k(c,"smartMapping.createAgeInfo: missing parameters."),c.promise;var b=a.layer;b.addPlugin(y).then(function(){var d=a.units?{units:a.units}:b.statisticsPlugin.getSuggestedAgeUnits({startTime:a.startTime,endTime:a.endTime});S(d).then(function(b){Ua(b,
a,c)}).otherwise(function(a){k(c,"smartMapping.createAgeInfo: unable to calculate age units.")})}).otherwise(function(a){k(c,"smartMapping.createAgeInfo: error when adding feature layer statistics plugin.")});return c.promise},excludedFields:qa,getSuggestedField:function(a){var c=new v;if(!a||!(a.layer||a.fields&&a.objectIdField))return k(c,"smartMapping.getSuggestedField: missing parameters."),c.promise;a.layer?ca(a.layer,function(){c.resolve(pa(a.layer.fields,a.layer.objectIdField))}):c.resolve(pa(a.fields,
a.objectIdField));return c.promise}});ua("extend-esri")&&D.setObject("renderer.smartMapping",B,xa);return B});