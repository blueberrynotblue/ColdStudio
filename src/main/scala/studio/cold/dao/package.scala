package studio.cold

import com.typesafe.config.ConfigFactory
import io.getquill.{PostgresJdbcContext, SnakeCase}

package object dao {
  lazy val postgresCtx=new PostgresJdbcContext(SnakeCase,ConfigFactory.defaultApplication().getConfig("ctx"))
}
