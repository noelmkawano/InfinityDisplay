import models.Contact;
import models.ContactDB;
import models.DietType;
import models.TelephoneType;
import play.Application;
import play.GlobalSettings;
import views.formdata.ContactFormData;

import java.util.ArrayList;
import java.util.List;

/**
 * Initializes test data for the application.
 */
public class Global extends GlobalSettings {

  @Override
  public void onStart(Application application) {
    super.onStart(application);

    if (TelephoneType.find().all().isEmpty()) {
      ContactDB.addTelephoneType(new TelephoneType("Equalizer"));
      ContactDB.addTelephoneType(new TelephoneType("Waveform"));
      ContactDB.addTelephoneType(new TelephoneType("Movie"));
    }
    if (DietType.find().all().isEmpty()) {
      ContactDB.addDietType(new DietType("Eq"));
      ContactDB.addDietType(new DietType("Wave"));
      ContactDB.addDietType(new DietType("Text"));
      ContactDB.addDietType(new DietType("Movie"));
      ContactDB.addDietType(new DietType("Kinect"));
    }

    if (Contact.find().all().isEmpty()) {
      List<String> testDiet = new ArrayList<>();
      ContactDB.addContacts(new ContactFormData("100", "100", "Waveform", "Waveform", testDiet));
      List<String> testDiet2 = new ArrayList<>();
      testDiet2.add(0, "Kinect");
      testDiet2.add(1, "Wave");
      ContactDB.addContacts(new ContactFormData("50", "50", "Eq", "Equalizer", testDiet2));
      List<String> testDiet3 = new ArrayList<>();
      ContactDB.addContacts(new ContactFormData("1", "100", "Movie", "Movie", testDiet3));
      List<String> testDiet4 = new ArrayList<>();
      testDiet4.add(0, "Eq");
      testDiet4.add(1, "Text");
      testDiet4.add(2, "Wave");
      ContactDB.addContacts(new ContactFormData("25", "75", "Fire", "Movie", testDiet4));
    }
  }
}
