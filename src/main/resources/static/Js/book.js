function myFunction() {
  alert("Please, sign up or sign in before booking your tour!");
}



// disable old date
var date = new Date();    //display todays date(mm-dd-yy)
var tdate = date.getDate();   //show todays date only (8)
var month = date.getMonth() + 1;  //return last month (6)
if (tdate < 10) {
  tdate = "0" + tdate; //(08)
}
if (month < 10) {
  month = "0" + month; //(06)
}
var year = date.getUTCFullYear();  //returns current yr
var minDate = year + "-" + month + "-" + tdate;
document.getElementById("disable").setAttribute('min', minDate)
console.log(minDate);



