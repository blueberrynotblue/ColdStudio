package studio.cold.dao

case class BlogTag(blogTitle: String, tagName: String)

object BlogTagDao {

  import postgresCtx._

  def batchCreate(blogTags: List[BlogTag]): List[Long] = {
    val q = quote {
      liftQuery(blogTags).foreach(b => query[BlogTag].insert(b))
    }
    postgresCtx.run(q)
  }

  def find(title: String): List[BlogTag] = postgresCtx.run(
    query[BlogTag].filter(_.blogTitle == lift(title))
  )
}
