package studio.cold.dao

case class Tag(name: String)

object TagDao {

  import postgresCtx._

  def create(tag: Tag): Long = postgresCtx.run(query[Tag].insert(lift(tag)))

  def getAll: List[Tag] =postgresCtx.run(query[Tag])
}
