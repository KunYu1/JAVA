// Fig. 13.14: CoverViewerController.java
// Controller for Cover Viewer application
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class CoverViewerController {
   // instance variables for interacting with GUI
   @FXML private ListView<Book> booksListView;
   @FXML private ImageView coverImageView00;
   @FXML private ImageView coverImageView01;
   @FXML private ImageView coverImageView02;
   @FXML private ImageView coverImageView10;
   @FXML private ImageView coverImageView11;
   @FXML private ImageView coverImageView12;
   @FXML private ImageView coverImageView20;
   @FXML private ImageView coverImageView21;
   @FXML private ImageView coverImageView22;

   // stores the list of Book Objects
   private final ObservableList<Book> books = 
      FXCollections.observableArrayList();
	  
	private final String[] str = new String [9];
	
   // initialize controller
   public void initialize() {
      // populate the ObservableList<Book>
      books.add(new Book("Android How to Program", 
         "/images/small/androidhtp.jpg", "/images/large/androidhtp.jpg"));
      books.add(new Book("C How to Program", 
         "/images/small/chtp.jpg", "/images/large/chtp.jpg"));
      books.add(new Book("C++ How to Program",
         "/images/small/cpphtp.jpg", "/images/large/cpphtp.jpg"));
      books.add(new Book("Internet and World Wide Web How to Program",  
         "/images/small/iw3htp.jpg", "/images/large/iw3htp.jpg"));
      books.add(new Book("Java How to Program", 
         "/images/small/jhtp.jpg", "/images/large/jhtp.jpg"));
      books.add(new Book("Visual Basic How to Program", 
         "/images/small/vbhtp.jpg", "/images/large/vbhtp.jpg"));
      books.add(new Book("Visual C# How to Program", 
         "/images/small/vcshtp.jpg", "/images/large/vcshtp.jpg"));
      booksListView.setItems(books); // bind booksListView to books
	
		for(int i=0 ;i<9;i++){
		str[i]="";}
	
      // when ListView selection changes, show large cover in ImageView
      booksListView.getSelectionModel().selectedItemProperty().
         addListener(
            
			new ChangeListener<Book>() {                                   
               @Override                                                     
               public void changed(ObservableValue<? extends Book> ov,
                  Book oldValue, Book newValue) {  
					 if(str[8]!="")
						coverImageView22.setImage(new Image(str[8]));
					 if(str[7]!="")
						coverImageView21.setImage(new Image(str[7]));
					 if(str[6]!="")
						coverImageView20.setImage(new Image(str[6]));
					 if(str[5]!="")
						coverImageView12.setImage(new Image(str[5]));
					 if(str[4]!="")
						coverImageView11.setImage(new Image(str[4]));
					 if(str[3]!="")
						coverImageView10.setImage(new Image(str[3]));
					 if(str[2]!="")
						coverImageView02.setImage(new Image(str[2]));
					 if(str[1]!="")
						coverImageView01.setImage(new Image(str[1]));
					 coverImageView00.setImage(new Image(newValue.getLargeImage()));
					
					str[0]=newValue.getLargeImage();
					for(int i=8;i>0;i--)
					{
						str[i] = str[i-1];
					}
					 
               }
            }
			
			
         );                                                                  
   }     
}

/**************************************************************************
 * (C) Copyright 1992-2018 by Deitel & Associates, Inc. and               *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *                                                                        *
 * DISCLAIMER: The authors and publisher of this book have used their     *
 * best efforts in preparing the book. These efforts include the          *
 * development, research, and testing of the theories and programs        *
 * to determine their effectiveness. The authors and publisher make       *
 * no warranty of any kind, expressed or implied, with regard to these    *
 * programs or to the documentation contained in these books. The authors *
 * and publisher shall not be liable in any event for incidental or       *
 * consequential damages in connection with, or arising out of, the       *
 * furnishing, performance, or use of these programs.                     *
 *************************************************************************/
