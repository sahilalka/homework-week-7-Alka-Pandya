package homework_week_7;

/**14. Person
 Write a class with the name Person. The class needs three fields (instance variables) with the names
 firstName, lastName of type String and age of type int.
 *
 */
public class Programme14Person {

    String firstName;
    String lastName;
    int age;

    public String getFirstName() {
        return firstName;

    }
    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;

    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age > 0 && age <= 100) {
          this.age =age;
        } else {
            this.age = 0;
        }
    }

    public boolean isTeen() {
        if (age > 12 && age < 20) {
            return true;
        }
            return false;
        }
        public String getFullName(){

            if (firstName.isEmpty()) {
                return lastName;
            }
                  if (lastName.isEmpty()) {
                   return firstName;
            }  if (firstName.isEmpty() && lastName.isEmpty()) {
                return "";

            } else {
                return firstName  +  " "  + lastName;
            }

        }


    public static void main(String[] args) {
              Programme14Person programme14Person = new Programme14Person();
              programme14Person.setFirstName(""); // firstname is set to empty string
              programme14Person.setLastName(""); // lastname is set to empty string
              programme14Person.setAge(10);
              System.out.println("fullName= " + programme14Person.getFullName());
              programme14Person.setFirstName("John");//first name is set to John
              programme14Person.setAge(18);
              System.out.println("fullName= " + programme14Person.getFullName());
              System.out.println("teen= " + programme14Person.isTeen());
              programme14Person.setLastName(("Smith")); //lastName is set to Smith
              System.out.println("fullName= " + programme14Person.getLastName());

    }

}







