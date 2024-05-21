const fs=require('fs')
fs.readfile(a.txt,function(err,data){
  if(err){
    console.log('fail')}
  console.log(data)})
