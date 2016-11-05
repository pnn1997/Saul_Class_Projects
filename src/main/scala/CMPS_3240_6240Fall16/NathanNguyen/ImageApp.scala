package CMPS_3240_6240Fall16.NathanNguyen

/**
  * Created by Nathan on 10/27/2016.
  */
import CMPS_3240_6240Fall16.NathanNguyen.ImageClassifiers._
import Readers.NathanNguyen.NathanImageReader
import scala.collection.JavaConversions._
object ImageApp extends App{

  val allImagesTrain= new NathanImageReader("data/NathanData/train.txt").images
  val allImagesTest= new NathanImageReader("data/NathanData/gold.txt").images

  ImageDataModel.image.populate(allImagesTrain)
  ImageDataModel.image.populate(allImagesTest,false)

  ImageClassifier.learn(5)
  ImageClassifier.test()
}
