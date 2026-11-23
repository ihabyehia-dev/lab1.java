package solutionlab1;

Scanner c=new Scanner(String.in);public static void main(String[]args){int num;int value;System.out.println("Enter the array capacity: ");int currentNb=c.nextInt();isEmpty();InsertElementAtBack(num);isFull();InsertElementAtFront();InsertElementAtPosition();display();SearchValue(10);DeleteElement(del);averageofEvenNb();MultiplesOfEvenThree();OccurrencesNb(7);Palindrome();FindSecondMaximum();EvenOrOdd();}

public int ArrayInt(){private int currentNB;int[]a=new int[currentNB];

public int ArrayInt(){this.currentNB=currentNB;}

public boolean isEmpty(int[]a){boolean ok=false;int count=0;for(int i=0;i<currentNb;i++){count+=a[0];}if(count>0){ok=true;}else{ok=false;}}

void isFull(int[]a){int count=0;for(int i=0;i<currentNB;i++){if(a[i]>0||a[i]<0){count++;}}if(count==currentNB){System.out.print("The arry is full");}else{System.out.println("The array is NOT full");}}

void InsertAtFront(int value){

System.out.println("Enter the number to be inserted; ");value=c.nextInt();

if(isFull(a)==false){for(int i=0;i<currentNB;i++){a[i]=a[i+1];}}num=a[0];}

void InsertAtBack(int num){System.out.println("Enter the number to be inserted; ");num=c.nextInt();if(isfull(a)==false){for(int i=currentNB;i>0;i--){a[i]=a[i-1];}}num=a[i];}

void InsertElementAtPositiok(){System.out.println("Enter the number: ");int num=c.nextInt();System.out.println("enter the positon of inserting: ");int pos=c.nextInt();

num=a[pos];}

void display(){

for(int i=0;i<currentNB;i++){System.out.print(a[i]+", ");}}

public int SaarchValue(int search){int count=0;

for(int i=0;i<currentNB;i++){if(search==a[i]){count=a[i];}}if(count!=0){return count;}else{return-1;}}void DeleteElement(int del){boolean ok=false;

for(int i=0;i<currentNB;i++){if(del==a[i]){a[i]=0;ok=true;}}if(ok==true){System.out.println("true");}else{System.out.println("False");}}

public double averageOfEvenNb(){double count=0;

for(int i=0;i<currentNb;i++){if(a[i]%2==0){count+=a[i];}}int average=count/currentNB;

return average;}

void MultiplesOfEvenThree(){

for(int i=0;i<currentNB;i++){if(a[i]%2==0&&a[i]%3==0){System.out.print(a[i]+", ");}}}

void OccurrenceNb(int occ){int count=0;

for(int i=0;i<currentNb;i++){if(occ==a[i]){count++;}}system.out.println("The number of occurrences of number "+occ+" is "+count+" times");

}

void Palindrome(int a[]){int count=a[i];int count2=a[currentNB];for(int i=0;i<currentNb;i++){if(a[i]==a[currentNB]){currentNb--;}}if(a[i]==currentNb){system.out.println("True");}else{System.out.print("False");}}

public int FindSecondMax(){int max=0;int count;int secondmax=a[i];for(int i=0;i<currentNb;i++){if(a[i+1]>secondmax[i]){max=a[i+1];}else{count=max;max=secondmax;secondmax=count;}}return secondmax;}

public int EvenOrOdd(){int even=0;int odd=0;

for(int i=0;i<currentNb;i++){if(a[i]%2==0){even++;}else{odd++;}}if(even>odd){return even;}else{return odd;}}
