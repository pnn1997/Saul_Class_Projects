package CMPS_3240_6240Fall16.NathanNguyen

/**
  * Created by Nathan on 10/27/2016.
  */

import edu.illinois.cs.cogcomp.saul.datamodel.DataModel
import scala.io.Source

object ImageDataModel extends DataModel{
  val image= node[String]

  //Gets all possible labels from wlist.txt file and stores it in labelsList
  val labelIDList = Source.fromFile("data/NathanData/wlist.txt").getLines.toList.filterNot(_.isEmpty).map { line =>
    line.split("[\t. /]")
  }.toArray


  //Extracts the different features for each segment of the images given by features.txt
  val featuresList = Source.fromFile("data/NathanData/features.txt").getLines.toList.filterNot(_.isEmpty).map { line =>
    line.split("[\t. /]")
  }.toArray


  //Extracts the various hierarchical relations labels of an image segment given in ontology_path.txt
  val ontologyList = Source.fromFile("data/NathanData/ontology_path.txt").getLines.toList.filterNot(_.isEmpty).map { line =>
    line.split("[\t. /]")
  }.toArray

  //Extracts the labels that corresponds to each image
  val labelsList = Source.fromFile("data/NathanData/labels.txt").getLines.toList.filterNot(_.isEmpty).map { line =>
    line.split("[\t. /]")
  }.toArray

  val ImageFeature1= property(image){
    x: String => {
      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[/.]")


      //Finds the feature that corresponds to the given image
      val features = featuresList.filter(x => x(0).equals(tokens(2)))(0)

      //Returns the value of located
      features(2)


    }
  }

  val ImageLabel =property(image){
    x: String => {

      //Splits the imageName into different components, with item at (2) being the image file number
      val tokens= x.split("[/.]")
      val test = tokens(2)
      //Finds the which labelID corresponds to the given image
      val labelID = (labelsList.filter(x => x(0).equals(tokens(2))))(0)(2)

      //Matches the labelID with the corresponding label
      val label = labelIDList.filter(x => x(0).equals(labelID))
      label(0)(1)
    }
  }
}
