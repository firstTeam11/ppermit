//>>built
define("dojox/charting/axis2d/Log","dojo/_base/lang dojo/_base/array dojo/_base/sniff dojo/_base/declare dojo/_base/connect dojo/dom-geometry ./Invisible ../scaler/common ../scaler/linear ../scaler/log ./common dojox/gfx dojox/lang/utils dojox/lang/functional".split(" "),function(y,K,Y,aa,M,ba,ca,fa,da,ea,U,x,R,S){return aa("dojox.charting.axis2d.Log",ca,{defaultParams:{vertical:!1,fixUpper:"none",fixLower:"none",natural:!1,leftBottom:!0,includeZero:!1,fixed:!0,majorLabels:!0,minorTicks:!0,minorLabels:!0,
microTicks:!1,rotation:0,htmlLabels:!0,enableCache:!1,dropLabels:!0,labelSizeChange:!1,log:10},optionalParams:{min:0,max:1,from:0,to:1,majorTickStep:4,minorTickStep:2,microTickStep:1,labels:[],labelFunc:null,maxLabelSize:0,maxLabelCharCount:0,trailingSymbol:null,stroke:{},majorTick:{},minorTick:{},microTick:{},tick:{},font:"",fontColor:"",title:"",titleGap:0,titleFont:"",titleFontColor:"",titleOrientation:""},constructor:function(a,d){this.opt=y.clone(this.defaultParams);R.updateWithObject(this.opt,
d);R.updateWithPattern(this.opt,d,this.optionalParams);this.opt.enableCache&&(this._textFreePool=[],this._lineFreePool=[],this._textUsePool=[],this._lineUsePool=[]);this._invalidMaxLabelSize=!0;1<this.opt.log?(this.scalerType=ea,this.scalerType.setBase(this.opt.log)):this.scalerType=da},setWindow:function(a,d){a!=this.scale&&(this._invalidMaxLabelSize=!0);return this.inherited(arguments)},_groupLabelWidth:function(a,d,g){if(!a.length)return 0;50<a.length&&(a.length=50);y.isObject(a[0])&&(a=S.map(a,
function(a){return a.text}));g&&(a=S.map(a,function(a){return 0==y.trim(a).length?"":a.substring(0,g)+this.trailingSymbol},this));a=a.join("\x3cbr\x3e");return x._base._getTextBox(a,{font:d}).w||0},_getMaxLabelSize:function(a,d,g,h,f,m){if(null==this._maxLabelSize&&6==arguments.length){var e=this.opt;this.scaler.minMinorStep=this._prevMinMinorStep=0;var b=y.clone(e);delete b.to;delete b.from;var l=this.scalerType.buildScaler(a,d,g,b,e.to-e.from);l.minMinorStep=0;this._majorStart=l.major.start;e=this.scalerType.buildTicks(l,
e);if(m&&e){var p=l=0,c=function(a){a.label&&this.push(a.label)},k=[];this.opt.majorLabels&&(K.forEach(e.major,c,k),l=this._groupLabelWidth(k,f,b.maxLabelCharCount),b.maxLabelSize&&(l=Math.min(b.maxLabelSize,l)));k=[];this.opt.dropLabels&&this.opt.minorLabels&&(K.forEach(e.minor,c,k),p=this._groupLabelWidth(k,f,b.maxLabelCharCount),b.maxLabelSize&&(p=Math.min(b.maxLabelSize,p)));this._maxLabelSize={majLabelW:l,minLabelW:p,majLabelH:m,minLabelH:m}}else this._maxLabelSize=null}return this._maxLabelSize},
calculate:function(a,d,g){this.inherited(arguments,[a,d,g,this.scalerType]);this.scaler.minMinorStep=this._prevMinMinorStep;if((this._invalidMaxLabelSize||g!=this._oldSpan)&&Infinity!=a&&-Infinity!=d){this._invalidMaxLabelSize=!1;this.opt.labelSizeChange&&(this._maxLabelSize=null);this._oldSpan=g;var h=this.opt,f=this.chart.theme.axis,m=h.rotation%360,e=this.chart.theme.axis.tick.labelGap,b=h.font||f.majorTick&&f.majorTick.font||f.tick&&f.tick.font,f=b?x.normalizedLength(x.splitFontString(b).size):
0,b=this._getMaxLabelSize(a,d,g,m,b,f);"number"!=typeof e&&(e=4);if(b&&h.dropLabels){var h=Math.abs(Math.cos(m*Math.PI/180)),l=Math.abs(Math.sin(m*Math.PI/180));0>m&&(m+=360);switch(m){case 0:case 180:this.vertical?m=f:(m=b.majLabelW,f=b.minLabelW);break;case 90:case 270:this.vertical?(m=b.majLabelW,f=b.minLabelW):m=f;break;default:m=this.vertical?Math.min(b.majLabelW,f/h):Math.min(b.majLabelW,f/l),f=Math.min(Math.sqrt(b.minLabelW*b.minLabelW+f*f),this.vertical?f*h+b.minLabelW*l:b.minLabelW*h+f*l)}this.scaler.minMinorStep=
this._prevMinMinorStep=Math.max(m,f)+e;this._skipInterval=this.scaler.minMinorStep<=this.scaler.minor.tick*this.scaler.bounds.scale?0:Math.floor((m+e)/(this.scaler.major.tick*this.scaler.bounds.scale))}else this._skipInterval=0}this.ticks=this.scalerType.buildTicks(this.scaler,this.opt);return this},getOffsets:function(){var a={l:0,r:0,t:0,b:0};if(!this.scaler)return a;var d=this.opt,g=this.chart.theme.axis,h=this.chart.theme.axis.tick.labelGap,f=d.titleFont||g.title&&g.title.font,g=0==d.titleGap?
0:d.titleGap||g.title&&g.title.gap,m=this.chart.theme.getTick("major",d),e=this.chart.theme.getTick("minor",d),f=f?x.normalizedLength(x.splitFontString(f).size):0,b=d.rotation%360,l=d.leftBottom,p=Math.abs(Math.cos(b*Math.PI/180)),c=Math.abs(Math.sin(b*Math.PI/180));this.trailingSymbol=void 0===d.trailingSymbol||null===d.trailingSymbol?this.trailingSymbol:d.trailingSymbol;"number"!=typeof h&&(h=4);0>b&&(b+=360);var k=this._getMaxLabelSize();if(k){var r=Math.ceil(Math.max(k.majLabelW,k.minLabelW))+
1,n=Math.ceil(Math.max(k.majLabelH,k.minLabelH))+1;if(this.vertical)switch(k=l?"l":"r",b){case 0:case 180:a[k]=r;a.t=a.b=n/2;break;case 90:case 270:a[k]=n;a.t=a.b=r/2;break;default:45>=b||180<b&&225>=b?(a[k]=n*c/2+r*p,a[l?"t":"b"]=n*p/2+r*c,a[l?"b":"t"]=n*p/2):315<b||180>b&&135<b?(a[k]=n*c/2+r*p,a[l?"b":"t"]=n*p/2+r*c,a[l?"t":"b"]=n*p/2):90>b||180<b&&270>b?(a[k]=n*c+r*p,a[l?"t":"b"]=n*p+r*c):(a[k]=n*c+r*p,a[l?"b":"t"]=n*p+r*c)}else switch(k=l?"b":"t",b){case 0:case 180:a[k]=n;a.l=a.r=r/2;break;case 90:case 270:a[k]=
r;a.l=a.r=n/2;break;default:45<=b&&90>=b||225<=b&&270>=b?(a[k]=n*p/2+r*c,a[l?"r":"l"]=n*c/2+r*p,a[l?"l":"r"]=n*c/2):90<=b&&135>=b||270<=b&&315>=b?(a[k]=n*p/2+r*c,a[l?"l":"r"]=n*c/2+r*p,a[l?"r":"l"]=n*c/2):45>b||180<b&&225>b?(a[k]=n*p+r*c,a[l?"r":"l"]=n*c+r*p):(a[k]=n*p+r*c,a[l?"l":"r"]=n*c+r*p)}a[k]+=h+Math.max(m.length,e.length)+(d.title?f+g:0)}return a},cleanGroup:function(a){this.opt.enableCache&&this.group&&(this._lineFreePool=this._lineFreePool.concat(this._lineUsePool),this._lineUsePool=[],
this._textFreePool=this._textFreePool.concat(this._textUsePool),this._textUsePool=[]);this.inherited(arguments)},createText:function(a,d,g,h,f,m,e,b,l){if(!this.opt.enableCache||"html"==a)return U.createText[a](this.chart,d,g,h,f,m,e,b,l);0<this._textFreePool.length?(a=this._textFreePool.pop(),a.setShape({x:g,y:h,text:m,align:f}),d.add(a)):a=U.createText[a](this.chart,d,g,h,f,m,e,b);this._textUsePool.push(a);return a},createLine:function(a,d){var g;this.opt.enableCache&&0<this._lineFreePool.length?
(g=this._lineFreePool.pop(),g.setShape(d),a.add(g)):g=a.createLine(d);this.opt.enableCache&&this._lineUsePool.push(g);return g},render:function(a,d){var g,h,f,m,e,b,l,p,c,k,r,n,F,G;if(!this.dirty||!this.scaler)return this;var u=this.opt;c=this.chart.theme.axis;var z=u.leftBottom,t=u.rotation%360,w=0,C,q,w=this.chart.theme.axis.tick.labelGap,A=u.font||c.majorTick&&c.majorTick.font||c.tick&&c.tick.font,y=u.titleFont||c.title&&c.title.font,M=u.fontColor||c.majorTick&&c.majorTick.fontColor||c.tick&&c.tick.fontColor||
"black",R=u.titleFontColor||c.title&&c.title.fontColor||"black";e=0==u.titleGap?0:u.titleGap||c.title&&c.title.gap||15;var H=u.titleOrientation||c.title&&c.title.orientation||"axis",N=this.chart.theme.getTick("major",u),O=this.chart.theme.getTick("minor",u),V=this.chart.theme.getTick("micro",u),S="stroke"in u?u.stroke:c.stroke,v=A?x.normalizedLength(x.splitFontString(A).size):0;b=Math.abs(Math.cos(t*Math.PI/180));C=Math.abs(Math.sin(t*Math.PI/180));var L=y?x.normalizedLength(x.splitFontString(y).size):
0;"number"!=typeof w&&(w=4);0>t&&(t+=360);var P=this._getMaxLabelSize(),P=P&&P.majLabelW;if(this.vertical){F=a.height-d.b;G=void 0;r=d.t;n=void 0;c=(a.height-d.b+d.t)/2;k=void 0;C=v*C+(P||0)*b+w+Math.max(N.length,O.length)+L+e;l=0;p=-1;h=g=0;e=1;b=0;f=w;m=0;switch(t){case 0:q="end";h=.4*v;break;case 90:q="middle";g=-v;break;case 180:q="start";h=.4*-v;break;case 270:q="middle";break;default:45>t?(q="end",h=.4*v):90>t?(q="end",h=.4*v):135>t?q="start":225>t?(q="start",h=.4*-v):270>t?(q="start",g=z?0:
.4*v):315>t?(q="end",g=z?0:.4*v):(q="end",h=.4*v)}if(z)G=n=d.l,w=H&&"away"==H?90:270,k=d.l-C+(270==w?L:0),e=-1,f=-f;else switch(G=n=a.width-d.r,w=H&&"axis"==H?90:270,k=a.width-d.r+C-(270==w?0:L),q){case "start":q="end";break;case "end":q="start";break;case "middle":g+=v}}else{G=d.l;F=void 0;n=a.width-d.r;r=void 0;k=(a.width-d.r+d.l)/2;c=void 0;C=v*b+(P||0)*C+w+Math.max(N.length,O.length)+L+e;l=1;e=h=g=p=0;b=1;f=0;m=w;switch(t){case 0:q="middle";h=v;break;case 90:q="start";g=.4*-v;break;case 180:q=
"middle";break;case 270:q="end";g=.4*v;break;default:45>t?(q="start",h=z?v:0):135>t?(q="start",g=.4*-v):180>t?(q="start",h=z?0:-v):225>t?(q="end",h=z?0:-v):315>t?(q="end",h=z?.4*v:0):(q="end",h=z?v:0)}if(z)F=r=a.height-d.b,w=H&&"axis"==H?180:0,c=a.height-d.b+C-(w?L:0);else switch(F=r=d.t,w=H&&"away"==H?180:0,c=d.t-C+(w?0:L),b=-1,m=-m,q){case "start":q="end";break;case "end":q="start";break;case "middle":h-=v}}this.cleanGroup();var I=this.group,z=this.scaler,J=this.ticks,W=this.scalerType.getTransformerFromModel(this.scaler),
B=u.title&&w||t||!this.opt.htmlLabels||Y("ie")||Y("opera")?"gfx":"html",D=e*N.length,E=b*N.length,T=this._skipInterval;I.createLine({x1:G,y1:F,x2:n,y2:r}).setStroke(S);u.title&&(y=U.createText[B](this.chart,I,k,c,"middle",u.title,y,R),"html"==B?this.htmlElements.push(y):y.setTransform(x.matrix.rotategAt(w,k,c)));if(null==J)return this.dirty=!1,this;var X=this.opt.majorLabels;K.forEach(J.major,function(a,b){var c=W(a.value),d=G+l*c,k=F+p*c;this.createLine(I,{x1:d,y1:k,x2:d+D,y2:k+E}).setStroke(N);
if(a.label&&(!T||0==(b-(1+T))%(1+T))){var e=u.maxLabelCharCount?this.getTextWithLimitCharCount(a.label,A,u.maxLabelCharCount):{text:a.label,truncated:!1},e=u.maxLabelSize?this.getTextWithLimitLength(e.text,A,u.maxLabelSize,e.truncated):e,c=this.createText(B,I,d+D+f+(t?0:g),k+E+m+(t?0:h),q,e.text,A,M);this.chart.truncateBidi&&e.truncated&&this.chart.truncateBidi(c,a.label,B);e.truncated&&this.labelTooltip(c,this.chart,a.label,e.text,A,B);"html"==B?this.htmlElements.push(c):t&&c.setTransform([{dx:g,
dy:h},x.matrix.rotategAt(t,d+D+f,k+E+m)])}},this);D=e*O.length;E=b*O.length;if(X=this.opt.minorLabels&&!T&&10===this.opt.log&&J.minor.length){var Q=1,Z=Math.log(10);K.forEach(J.minor,function(a,b){var c=Math.log(a.value)/Z;Q=Math.min(Q,c-Math.floor(c),Math.ceil(c)-c);b&&(Q=Math.min(Q,c-Math.log(J.minor[b-1].value)/Z))});X=z.minMinorStep<=Q*z.bounds.scale}K.forEach(J.minor,function(a){var b=W(a.value),c=G+l*b,d=F+p*b;this.createLine(I,{x1:c,y1:d,x2:c+D,y2:d+E}).setStroke(O);if(X&&a.label){var e=u.maxLabelCharCount?
this.getTextWithLimitCharCount(a.label,A,u.maxLabelCharCount):{text:a.label,truncated:!1},e=u.maxLabelSize?this.getTextWithLimitLength(e.text,A,u.maxLabelSize,e.truncated):e,b=this.createText(B,I,c+D+f+(t?0:g),d+E+m+(t?0:h),q,e.text,A,M);this.chart.getTextDir&&e.truncated&&this.chart.truncateBidi(b,a.label,B);e.truncated&&this.labelTooltip(b,this.chart,a.label,e.text,A,B);"html"==B?this.htmlElements.push(b):t&&b.setTransform([{dx:g,dy:h},x.matrix.rotategAt(t,c+D+f,d+E+m)])}},this);D=e*V.length;E=
b*V.length;K.forEach(J.micro,function(a){var b=W(a.value);a=G+l*b;b=F+p*b;this.createLine(I,{x1:a,y1:b,x2:a+D,y2:b+E}).setStroke(V)},this);this.dirty=!1;return this},labelTooltip:function(a,d,g,h,f,m){var e=["dijit/Tooltip"],b={type:"rect"},l=["above","below"];h=x._base._getTextBox(h,{font:f}).w||0;f=f?x.normalizedLength(x.splitFontString(f).size):0;"html"==m?(y.mixin(b,ba.position(a.firstChild,!0)),b.width=Math.ceil(h),b.height=Math.ceil(f),this._events.push({shape:dojo,handle:M.connect(a.firstChild,
"onmouseover",this,function(a){require(e,function(a){a.show(g,b,l)})})}),this._events.push({shape:dojo,handle:M.connect(a.firstChild,"onmouseout",this,function(a){require(e,function(a){a.hide(b)})})})):(m=a.getShape(),d=d.getCoords(),b=y.mixin(b,{x:m.x-h/2,y:m.y}),b.x+=d.x,b.y+=d.y,b.x=Math.round(b.x),b.y=Math.round(b.y),b.width=Math.ceil(h),b.height=Math.ceil(f),this._events.push({shape:a,handle:a.connect("onmouseenter",this,function(a){require(e,function(a){a.show(g,b,l)})})}),this._events.push({shape:a,
handle:a.connect("onmouseleave",this,function(a){require(e,function(a){a.hide(b)})})}))},isNullValue:function(a){return 0>=a},naturalBaseline:1})});