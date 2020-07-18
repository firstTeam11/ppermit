// All material copyright ESRI, All Rights Reserved, unless otherwise specified.
// See http://js.arcgis.com/3.20/esri/copyright.txt for details.
//>>built
define("esri/tasks/geoenrichment/taskHelper",["dojo/_base/lang","dojo/Deferred","dojo/json","../../request","../../extend"],function(g,n,h,p,k){var f={invokeMethod:function(b,c,a,f,g,h){function k(a){var c;try{c=f(a)}catch(r){l(r);return}d&&d.resolve(c);b[g](c)}function l(a){d&&d.reject(a);b[h](a)}var e=null,d=null,d=new n(function(){e&&(e.cancel(),e=null)});try{var m=a?a():{};m.f="json";b.token&&(m.token=b.token);e=p({url:b.url+c,content:m,handleAs:"json"});e.then(k,l)}catch(q){l(q)}return d.promise},
jsonToRest:function(b){var c={},a;for(a in b)g.isString(b[a])?c[a]=b[a]:c[a]=h.stringify(b[a]);return c},throwEmptyResponse:function(){throw Error("Geoenrichment service returned empty response");}};k("esri.tasks.geoenrichment.taskHelper",f);return f});