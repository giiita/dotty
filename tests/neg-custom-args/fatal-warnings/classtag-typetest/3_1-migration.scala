import scala.language.`3.1-migration`
import scala.reflect.ClassTag

def f3_1m[T: ClassTag](x: Any): Unit =
  x match
    case _: T => // error
