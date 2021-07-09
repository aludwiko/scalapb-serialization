package mapper

import scalapb.TypeMapper

object BigDecimalTypeMapper {
  implicit val stingToBigDecimalMapper: TypeMapper[String, BigDecimal] =
    TypeMapper[String, BigDecimal](BigDecimal.apply)(_.bigDecimal.toPlainString)
}
