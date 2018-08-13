package studio.cold.entity
final case class Blog(title: String, content: String, date: Long) extends Dao[Blog] {
  def findOne: Blog = ctx.run(quote{

  })
}
