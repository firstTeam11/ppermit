// All material copyright ESRI, All Rights Reserved, unless otherwise specified.
// See http://js.arcgis.com/3.20/esri/copyright.txt for details.
//>>built
define("esri/dijit/geoenrichment/CheckList","../../declare dojo/dom-construct dojo/dom-class dojo/_base/lang dojo/query dojo/store/Memory dgrid/List dgrid/Selection dijit/layout/ContentPane".split(" "),function(d,e,f,g,k,l,m,n){function h(a,b){var c=e.create("div",{"class":"TrimWithEllipses"});b&&e.create("div",{"class":"dijit dijitInline dijitCheckBox VarCheck"},c);e.create("span",{"class":"VarLabel",innerHTML:a},c);return c}d=d("esri.dijit.geoenrichment.CheckList",[m,n],{selectionMode:"toggle",
store:null,selectedItems:null,useTouchScroll:!1,_setStore:function(a){this.store=a;this.refresh();this.renderArray(a.data)},_setItems:function(a){a=new l({data:a});this.set("store",a);this.refresh();this.renderArray(a.data)},buildRendering:function(){this.inherited(arguments);var a=g.hitch(this,this._onSelect);this.on("dgrid-select",a);this.on("dgrid-deselect",g.hitch(this,this._onDeselect))},select:function(a){this.inherited(arguments);var b=this.row(a).element;if(b){var c=k(".dijitCheckBox",b)[0];
c&&(f.contains(b,"dgrid-selected")?f.add(c,"dijitCheckBoxChecked"):f.remove(c,"dijitCheckBoxChecked"))}},renderRow:function(a,b){return h(a.description?a.description:a.alias,"single"!=this.selectionMode)},_setSelection:function(){this.selection=this.get("selection");this.selectedItems=[];if(this.selection&&this.store.data)for(var a=this.store.data,b=0;b<a.length;b++)this.selection[a[b].id]&&this.selectedItems.push(a[b])},_onSelect:function(a){this._setSelection();this.onSelect(a)},_onDeselect:function(a){this._setSelection();
this.onDeselect(a)},onDeselect:function(a){},onSelect:function(a){}});d.renderCheckBox=h;return d});