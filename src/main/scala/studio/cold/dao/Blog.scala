package studio.cold.dao

case class Blog(title: String, content: String, createdAt: Long)

case class BlogWithoutContent(title: String, createdAt: Long)

object BlogDao {

  import postgresCtx._

  def findAll: List[BlogWithoutContent] = postgresCtx.run(query[Blog].map { b =>
    BlogWithoutContent(b.title, b.createdAt)
  })

  def create(blog: Blog): Long = postgresCtx.run(query[Blog].insert(lift(blog)))

  def delete(title: String): Long = postgresCtx.run(query[Blog].filter(_.title == lift(title)).delete)

  def get(title: String): Option[Blog] = postgresCtx.run(query[Blog].filter(_.title == lift(title))).headOption

}
