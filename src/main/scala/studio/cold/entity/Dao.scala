package studio.cold.entity

import io.getquill.{PostgresJdbcContext, SnakeCase}

trait Dao[E] {
  lazy val ctx = new PostgresJdbcContext(SnakeCase, "ctx")

  import ctx._

  def findAll: Seq[E]= ctx.run(quote{
    query[E]
  })

  def findOne: E


}
