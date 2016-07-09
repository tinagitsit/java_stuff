// Truth table for logical operators
class LogicalOpTable{
  public static void main(String args[]){
    boolean p, q;
    System.out.println("P\tQ\tAND\tOR\tXOR\tNOT P");

    p = true;
    q = true;
    //System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));
    if(p){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(p&q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(p|q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(p^q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(!p){
      System.out.println(1);
    }
    else{
      System.out.println(0);
    }

    p = true;
    q = false;
    //System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));
    if(p){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(p&q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(p|q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(p^q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(!p){
      System.out.println(1);
    }
    else{
      System.out.println(0);
    }

    p = false;
    q = true;
    //System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));
    if(p){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(p&q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(p|q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(p^q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(!p){
      System.out.println(1);
    }
    else{
      System.out.println(0);
    }

    p = false;
    q = false;
    //System.out.println(p + "\t" + q + "\t" + (p&q) + "\t" + (p|q) + "\t" + (p^q) + "\t" + (!p));
    if(p){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(p&q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(p|q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(p^q){
      System.out.print(1 + "\t");
    }
    else{
      System.out.print(0 + "\t");
    }
    if(!p){
      System.out.println(1);
    }
    else{
      System.out.println(0);
    }
  }
}
