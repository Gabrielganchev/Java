public class Employee{
  private String name;
  private String jobTitle;
  public void setName(String nameIn){
    this.name = nameIn;

  }
  public String getName(){
    return name;
    }
    public void setJobTitle(String  jobTitlein){
      jobTitle =jobTitlein;
    }
    public String getJobTitle() {
      return jobTitle;
    }
    public void cutCheck(double amountPaid){
      System.out.printf("Pay to the order of %s",name);
      System.out.printf("(%s)  ***$", jobTitle);
      System.out.printf("%,...2f/n",amountPaid);
      
    }

}
