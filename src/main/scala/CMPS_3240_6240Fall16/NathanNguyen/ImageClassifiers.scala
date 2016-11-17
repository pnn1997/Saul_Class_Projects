package CMPS_3240_6240Fall16.NathanNguyen

/**
  * Created by Nathan on 10/27/2016.
  */

import edu.illinois.cs.cogcomp.lbjava.learn._
import weka.classifiers.`lazy`.IBk
import edu.illinois.cs.cogcomp.saul.classifier.Learnable
import weka.classifiers.bayes.NaiveBayes

object ImageClassifiers {
  import ImageDataModel._
  import edu.illinois.cs.cogcomp.saul.classifier.Learnable
  object ImageClassifier extends Learnable[String](image) {
    def label = ImageOntology
    override lazy val classifier = new SaulWekaWrapper(new NaiveBayes())
    override def feature = using(ImageFeature1)
  }
}

//WekaWrapper(new IBk(1))

/* , ImageFeature2 , ImageFeature3, ImageFeature4,
ImageFeature5, ImageFeature6, ImageFeature7, ImageFeature8, ImageFeature9, ImageFeature10,
ImageFeature11, ImageFeature12, ImageFeature13, ImageFeature14, ImageFeature15, ImageFeature16,
ImageFeature17, ImageFeature18, ImageFeature19, ImageFeature20, ImageFeature21, ImageFeature22,
ImageFeature23, ImageFeature24, ImageFeature25, ImageFeature26, ImageFeature27 */