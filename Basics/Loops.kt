fun main(){
    //while
    var bool = true;
    var count =0;
    while(bool){
        println("Hello World!");
        count++;
        if(count==5){
            break;
        }
    }
    //dowhile
    do{
        println("Hello World!");
        count++;
    }while(count!=6);

    //for loop
    for(i in 1..10){
        println(i);
    }

    //for loop with range
    for(i in 1..10 step 2){
        println(i);
    }

    //for loop until,downTo
}