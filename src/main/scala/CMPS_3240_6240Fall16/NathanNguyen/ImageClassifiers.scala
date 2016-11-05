package CMPS_3240_6240Fall16.NathanNguyen

/**
  * Created by Nathan on 10/27/2016.
  */

import edu.illinois.cs.cogcomp.lbjava.learn.{SparseNetworkLearner, SupportVectorMachine}

object ImageClassifiers {
  import ImageDataModel._
  import edu.illinois.cs.cogcomp.saul.classifier.Learnable
  object ImageClassifier extends Learnable[String](image) {
    def label = ImageLabel
    override lazy val classifier = new SparseNetworkLearner()
    override def feature = using(ImageFeature1)
  }
}
