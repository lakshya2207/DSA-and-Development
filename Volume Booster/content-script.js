chrome.runtime.onMessage.addListener(function(message,sender,sendResponse){
    message?
    // alert(message)
    ((v,a=new AudioContext(),g=a.createGain())=>(window._g??(c=>(a.createMediaElementSource(document.querySelector('video'))[c](g),g[c](a.destination),window._g=g))("connect")).gain.value=v??1)(parseFloat(prompt("Enter gain level not more than 4 !!",window._g?.gain.value))):"";

})