package HomeWork;

public class Library {

	public String addBook(String Title)
	{
		System.out.println("Book Added Successfully: "+ Title);
		return Title;
			}
	
	public void issueBook()
	{
		System.out.println("Book Issued Successfully");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library test = new Library();
		String ret= test.addBook("Think Big");
		System.out.println(ret);
		test.issueBook();
		

	}

}
