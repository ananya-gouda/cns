object bubblesort {
 def main(args : Array[String]) : Unit = {
 bubbleSort(Array(50,33,62,21,100)) foreach println
 }
 def bubbleSort(a:Array[Int]):Array[Int]={
 for(i<- 1 to a.length-1){
 for(j <- (i-1) to 0 by -1){
 if(a(j)>a(j+1)){
 val temp=a(j+1)
 a(j+1)=a(j)
 a(j)=temp
 }
 }
 }
 a
 }
}
