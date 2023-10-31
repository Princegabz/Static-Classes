
package prjclassesstatic;

public class GetterandSetter 
{
   private static String strName;
   private static String strSurname; //NB STATIC
   
   public void setName(String strName)
   {
       this.strName = strName;
   }        
   public void setSurname(String strSurname)
   {
       this.strSurname = strSurname;
   }       
    public String getName()
   {
       return this.strName;
   }     
     public String getSurname()
   {
      return this.strSurname;
   }       
}
