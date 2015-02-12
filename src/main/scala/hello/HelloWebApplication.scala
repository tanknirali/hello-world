package hello

import org.springframework.boot.SpringApplication
import org.springframework.context.annotation._
import org.springframework.boot.autoconfigure.EnableAutoConfiguration



@EnableAutoConfiguration
object HelloWebApplication {

  def main(args: Array[String]) {
    SpringApplication.run(classOf[HelloConfig]);
  }
}