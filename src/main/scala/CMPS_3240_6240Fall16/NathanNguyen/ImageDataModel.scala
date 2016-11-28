package CMPS_3240_6240Fall16.NathanNguyen

/**
  * Created by Nathan on 10/27/2016.
  */

import edu.illinois.cs.cogcomp.saul.datamodel.DataModel
import scala.io.Source

object ImageDataModel extends DataModel{
  val image= node[String]
  
  //Indices of the file name corresponding to the image and section numbers
  val imageNumPos = 0;
  val imageSecPos = 1;

  //Gets all possible labels from wlist.txt file and stores it in labelsList
  val labelIDList = Source.fromFile("data/NathanData/wlist.txt").getLines.toList.filterNot(_.isEmpty).map { line =>
    line.split("[\t. /]")
  }.toArray


  //Extracts the different features for each segment of the images given by features.txt
  //NOTE: I processed the features.txt so that only a single space separates each entry within each line
  val featuresList = Source.fromFile("data/NathanData/features.txt").getLines.toList.filterNot(_.isEmpty).map { line =>
    line.split("[\t /]")
  }.toArray


  //Extracts the various hierarchical relations labels of an image segment given in ontology_path.txt
  //NOTE: I processed the ontology_path.txt so that only a single space separates each entry within each line
  //NOTE2: I also removed the entry that did not have a label besides "entity"
  val ontologyList = Source.fromFile("data/NathanData/ontology_path.txt").getLines.toList.filterNot(_.isEmpty).map { line =>
    line.split("[\t. />]")
  }.toArray

  //Extracts the labels that corresponds to each image from labels.txt
  val labelsList = Source.fromFile("data/NathanData/labels.txt").getLines.toList.filterNot(_.isEmpty).map { line =>
    line.split("[\t /]")
  }.toArray

  //Gives a label to the image based on the label given in labels.txt
  val ImageLabel =property(image){
    x: String => {

      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds which labelID corresponds to the given image
      val labelID = (labelsList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos))))(0)(2)

      //Matches the labelID with the corresponding label
      val label = labelIDList.filter(x => x(0).equals(labelID))
      label(0)(1)
    }
  }

  //Gives a more general label to each image based on the most general category found in ontology_path.txt
  val ImageOntology =property(image){
    x: String => {

      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the most general label for the image from its ontology text
      val genLabel = ontologyList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the most general label for the image (excluding Entity)
      genLabel(3)
    }
  }

  /*
   * The following features were derived from the data in features.txt provided with the data
   */

  val ImageFeature1= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(2).toDouble
    }
  }

  val ImageFeature2= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(3).toDouble
    }
  }

  val ImageFeature3= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(4).toDouble
    }
  }

  val ImageFeature4= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(5).toDouble
    }
  }

  val ImageFeature5= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(6).toDouble
    }
  }

  val ImageFeature6= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(7).toDouble
    }
  }

  val ImageFeature7= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(8).toDouble
    }
  }

  val ImageFeature8= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(9).toDouble
    }
  }

  val ImageFeature9= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(10).toDouble
    }
  }

  val ImageFeature10= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(11).toDouble
    }
  }

  val ImageFeature11= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(12).toDouble
    }
  }

  val ImageFeature12= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(13).toDouble
    }
  }

  val ImageFeature13= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(14).toDouble
    }
  }

  val ImageFeature14= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(15).toDouble
    }
  }

  val ImageFeature15= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(16).toDouble
    }
  }

  val ImageFeature16= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(17).toDouble
    }
  }

  val ImageFeature17= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(18).toDouble
    }
  }

  val ImageFeature18= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(19).toDouble
    }
  }

  val ImageFeature19= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(20).toDouble
    }
  }

  val ImageFeature20= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(21).toDouble
    }
  }

  val ImageFeature21= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(22).toDouble
    }
  }

  val ImageFeature22= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(23).toDouble
    }
  }

  val ImageFeature23= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(24).toDouble
    }
  }

  val ImageFeature24= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(25).toDouble
    }
  }

  val ImageFeature25= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(26).toDouble
    }
  }

  val ImageFeature26= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(27).toDouble
    }
  }

  val ImageFeature27= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[\t/.]")

      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(imageNumPos)) && x(1).equals(tokens(imageSecPos)))(0)

      //Returns the double value of the respective feature
      features(28).toDouble
    }
  }
}
