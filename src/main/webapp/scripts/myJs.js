/**
 * Open Popup
 */
function openPopUp(name, url) {
	newwindow=window.open(url,name,'height=200,width=150');
	if (window.focus) {newwindow.focus()}
	return false;
}

(function(i, s, o, g, r, a, m){
  i['GoogleAnalyticsObject'] = r;
  i[r] = i[r] || function(){
    (i[r].q = i[r].q || []).push(arguments)
  },
  i[r].l =1 * new Date();
  a = s.createElement(o),
  m = s.getElementsByTagName(o)[0];
  a.async = 1;
  a.src = g;
  m.parentNode.insertBefore(a, m)
})(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

  ga('create', 'UA-59596126-1', 'auto');
  ga('send', 'pageview');



