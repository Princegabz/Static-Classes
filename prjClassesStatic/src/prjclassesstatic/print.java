
package prjclassesstatic;

public class print
{        
    public void PrintPar(String strName, String strSurname)
    {
        System.out.println("Name: "+strName+"\n Surname: " + strSurname);
    }       
    public void PrintOJ()
    {
        GetterandSetter gs = new GetterandSetter();
        System.out.println("Name: "+gs.getName()+ "\nSurname: "+ gs.getSurname());        
    }       
}
