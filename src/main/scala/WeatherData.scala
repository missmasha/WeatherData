import org.json4s.native.{Json, prettyJson, renderJValue}
import org.json4s.Xml.toJson
import org.json4s.jackson.Serialization.{read, write}

import scala.xml.XML.{loadFile, save}


object WeatherData extends App {
  val allFI = loadFile("src/main/resources/EE_meta.xml")

//  val allStations = allFI \\ "station_info"
//  val firstInJSON = toJson(allStations(0))
//  firstInJSON



  //FIXME The titles with the name of Station and its location
//  for (station <- 0 until allStations.length) {
//    scala.xml.XML.save(s"station $station", allStations(station))
//  }


}
