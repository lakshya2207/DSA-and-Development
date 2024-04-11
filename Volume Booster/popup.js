var gain=0;

document.getElementById('trigger').addEventListener('click', function() {
        // document.getElementById('input').value=`Gain = ${gain}`;
        gain=0?alert("DO NOT ENTER GAIN MORE THAN 4 !!"):"";
        gain++;
        
        chrome.tabs.query({active:true,currentWindow:true},function (tabs){
            chrome.tabs.sendMessage(tabs[0].id,{
                message:"go"
            })
        })
    
  });
  