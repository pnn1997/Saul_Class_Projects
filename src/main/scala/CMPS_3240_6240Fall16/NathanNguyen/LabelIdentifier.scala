package CMPS_3240_6240Fall16.NathanNguyen

import scala.io.Source
/**
  * Created by Nathan on 10/26/2016.
  * Serves as a test class
  */

object LabelIdentifier {
  def main(args: Array[String]): Unit = {
    "H.ello, wor ld!".split("[\t. /]").foreach(println)
  }

/*
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
*/

  /*
  val fileLines = Source.fromFile("data/NathanData/wlist.txt").getLines.toList
  val labels = fileLines.filterNot(_.isEmpty).map { line =>
    line.split("[\t. /]")
  }.toArray




  for(line <- featuresList) {
    line.foreach(println)
  }
  */

  //"annotations/00/112.eng".split("[/.]").foreach(println)
  //println(labelIDList.filter(x => x(0).equals("20"))(0)(1))

}
