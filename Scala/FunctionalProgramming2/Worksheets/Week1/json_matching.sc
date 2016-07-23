package Week1

object json_matching {

  abstract class JSON
  case class JSeq(elems: List[JSON]) extends JSON
  case class JObj(bindings: Map[String, JSON]) extends JSON
  case class JNum(num: Double) extends JSON
  case class JStr(str: String) extends JSON
  case class JBool(b: Boolean) extends JSON
  case object JNull extends JSON

  val data1 = JObj(Map(
    "firstName" -> JStr("John"),
    "lastName" -> JStr("Smith"),
    "address" -> JObj(Map(
      "streetAddress" -> JStr("21 2nd Street"),
      "state" -> JStr("NY"),
      "postalCode" -> JNum(10021)))))             //> data1  : Week1.json_matching.JObj = JObj(Map(firstName -> JStr(John), lastNa
                                                  //| me -> JStr(Smith), address -> JObj(Map(streetAddress -> JStr(21 2nd Street),
                                                  //|  state -> JStr(NY), postalCode -> JNum(10021.0)))))

  def show(json: JSON): String = json match {

    case JSeq(elems) =>
      "[" + (elems map show mkString ", ") + "]"

    case JObj(bindings) =>
      val assocs = bindings map {
        case (key, value) => "\"" + key + "\":" + show(value)
      }
      "{" + (assocs mkString ", ") + "}"

    case JNum(num) => num.toString
    case JStr(str) => '\"' + str + '\"'
    case JBool(b)  => b.toString
    case JNull     => "null"
  }                                               //> show: (json: Week1.json_matching.JSON)String

  show(data1)                                     //> res0: String = {"firstName":"John", "lastName":"Smith", "address":{"streetA
                                                  //| ddress":"21 2nd Street", "state":"NY", "postalCode":10021.0}}

}