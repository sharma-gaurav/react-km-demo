(this["webpackJsonpwknd-spa-react"]=this["webpackJsonpwknd-spa-react"]||[]).push([[0],{218:function(t,e,n){var s={".":40,"./":40,"./index":40,"./index.js":40};function o(t){var e=a(t);return n(e)}function a(t){if(!n.o(s,t)){var e=new Error("Cannot find module '"+t+"'");throw e.code="MODULE_NOT_FOUND",e}return s[t]}o.keys=function(){return Object.keys(s)},o.resolve=a,t.exports=o,o.id=218},223:function(t,e,n){},224:function(t,e,n){},225:function(t,e,n){"use strict";n.r(e);n(97),n(134),n(198);var s=n(24),o=n(11),a=n(0),r=n(93),c=n(3),p=n(2),i=n(7);class m extends p.Page{render(){return Object(i.jsxs)("div",{children:[this.childComponents,this.childPages]})}}var d=Object(p.withModel)(m);class l extends s.ModelClient{fetch(t){if(!t){const e=`Fetching model rejected for path: ${t}`;return Promise.reject(new Error(e))}const e=this._apiHost||"";return fetch(`${e}${t}`,{credentials:"same-origin",headers:{Authorization:""}}).then((t=>t.status>=200&&t.status<300?t.json():Promise.reject(t))).catch((t=>Promise.reject(t)))}}var b=n(62),h=n.n(b);const u=()=>Object(i.jsx)("div",{children:"Error loading chunks!"}),j=(O=t=>Object(i.jsx)("div",{className:"loading-skeleton loading-skeleton__block",style:{height:t.skeletonHeight?t.skeletonHeight:"50px"}}),g={skeletonHeight:1e3},function(t){return Object(i.jsx)(O,{...g,...t})});var O,g;var E=function(t){let e=arguments.length>1&&void 0!==arguments[1]?arguments[1]:j;return h()(t,{loading:e,error:u})};n(223);class y extends p.Page{get containerProps(){let t=super.containerProps;return t.className=(t.className||"")+" page "+(this.props.cssClassNames||""),t}}var w,C;Object(p.MapTo)("wknd-spa-react/components/page")(Object(p.withComponentMappingContext)((w=y,class extends a.Component{render(){let t=this.props.cqPath;return t?(C=C||"html",Object(i.jsx)(c.d,{exact:!0,path:"(.*)"+t+"(."+C+")?",render:t=>Object(i.jsx)(w,{...this.props,...t})},t)):Object(i.jsx)(w,{...this.props})}})));Object(p.MapTo)("wknd-spa-react/components/container")(Object(p.withComponentMappingContext)(p.AllowedComponentsContainer),{emptyLabel:"Container",isEmpty:function(t){return!t||!t.cqItemsOrder||0===t.cqItemsOrder.length}});Object(p.MapTo)("wknd-spa-react/components/experiencefragment")(Object(p.withComponentMappingContext)(p.Container),{emptyLabel:"Experience Fragment",isEmpty:function(t){return!t||!t.configured}});const k={emptyLabel:"Custom Banner",isEmpty:function(t){return!t||!t.title||t.title.trim().length<1}};class x extends a.Component{render(){return k.isEmpty(this.props)?null:Object(i.jsxs)("div",{className:"CustomComponent",children:[Object(i.jsx)("img",{src:this.props.imageURL}),Object(i.jsx)("h2",{className:"CustomComponent__title",children:this.props.title})]})}}Object(p.MapTo)("wknd-spa-react/components/custom-banner")(x,k);var M=n(94),T=n(95),V=n(33),I=n(9);const f=E((()=>Promise.all([n.e(3),n.e(4)]).then(n.bind(null,273)))),v=E((()=>n.e(5).then(n.t.bind(null,271,7)))),P=E((()=>n.e(6).then(n.t.bind(null,272,7))));Object(p.MapTo)("wknd-spa-react/components/download")(I.DownloadV1,{isEmpty:I.DownloadV1IsEmptyFn}),Object(p.MapTo)("wknd-spa-react/components/list")(I.ListV2,{isEmpty:I.ListV2IsEmptyFn}),Object(p.MapTo)("wknd-spa-react/components/separator")(I.SeparatorV1,{isEmpty:I.SeparatorV1IsEmptyFn}),Object(p.MapTo)("wknd-spa-react/components/button")(I.ButtonV1,{isEmpty:I.ButtonV1IsEmptyFn}),Object(p.MapTo)("wknd-spa-react/components/teaser")(I.TeaserV1,{isEmpty:I.TeaserV1IsEmptyFn}),Object(p.MapTo)("wknd-spa-react/components/image")(I.ImageV2,{isEmpty:I.ImageV2IsEmptyFn}),Object(p.MapTo)("wknd-spa-react/components/title")(v,{isEmpty:T.TitleV2IsEmptyFn}),Object(p.MapTo)("wknd-spa-react/components/breadcrumb")(I.BreadCrumbV2,{isEmpty:I.BreadCrumbV2IsEmptyFn}),Object(p.MapTo)("wknd-spa-react/components/navigation")(I.NavigationV1),Object(p.MapTo)("wknd-spa-react/components/languagenavigation")(I.LanguageNavigationV1),Object(p.MapTo)("wknd-spa-react/components/tabs")(V.TabsV1,{isEmpty:V.TabsV1IsEmptyFn}),Object(p.MapTo)("wknd-spa-react/components/accordion")(V.AccordionV1,{isEmpty:V.AccordionV1IsEmptyFn}),Object(p.MapTo)("wknd-spa-react/components/carousel")(P,{isEmpty:M.CarouselV1IsEmptyFn}),Object(p.MapTo)("wknd-spa-react/components/container")(V.ContainerV1,{isEmpty:V.ContainerV1IsEmptyFn});Object(p.MapTo)("wknd-spa-react/components/text")(f,{emptyLabel:"Text",isEmpty:function(t){return!t||!t.text||t.text.trim().length<1}});n(224);const F={};document.addEventListener("DOMContentLoaded",(()=>{s.ModelManager.initialize(F).then((t=>{const e=Object(o.a)();Object(r.render)(Object(i.jsx)(c.e,{history:e,children:Object(i.jsx)(d,{history:e,cqChildren:t[s.Constants.CHILDREN_PROP],cqItems:t[s.Constants.ITEMS_PROP],cqItemsOrder:t[s.Constants.ITEMS_ORDER_PROP],cqPath:t[s.Constants.PATH_PROP],locationPathname:window.location.pathname})}),document.getElementById("spa-root"))}))}))}},[[225,1,2]]]);
//# sourceMappingURL=main.5a118476.chunk.js.map