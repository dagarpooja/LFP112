var myDate = new Date()
var month = myDate.getMonth();

var month = ['jan','feb','march','april','may','june 2020','july','aug','sep','oct','nov','dec'];
if(month<10){
    
    console.log(month[11]);

} 
else(month>10) 
{

    console.log(month[5]);
}