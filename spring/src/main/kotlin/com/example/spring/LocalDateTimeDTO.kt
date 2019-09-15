package com.example.spring

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime

/**
 * deserialize from (request body)
 * {"date": "2019-08-08", "time": "19:21:33", "dateTime": "2019-08-08T19:21:33"}
 *
 * serialize to (response body)
 * {"date": "2019-08-08", "time": "19:21:33", "dateTime": "2019-08-08T19:21:33"}
 * */
data class LocalDateTimeDTO(
    val date: LocalDate?,
    val time: LocalTime?,
    val dateTime: LocalDateTime?
)

/**
 * deserialize from (request body)
 * {"date": "2019/08/08", "time": "19시 21분 33초", "dateTime": "2019/08/08 19시 21분 33초"}
 *
 * serialize to (response body)
 * {"date": "2019/08/08", "time": "19시 21분 33초", "dateTime": "2019/08/08 19시 21분 33초"}
 * */
data class LocalDateTimeDTO2(
    @JsonFormat(pattern = "yyyy/MM/dd") val date: LocalDate?,
    @JsonFormat(pattern = "HH시 mm분 ss초") val time: LocalTime?,
    @JsonFormat(pattern = "yyyy/MM/dd HH시 mm분 ss초") val dateTime: LocalDateTime?
)

/**
 * deserialize from (request body)
 * {"date": "2019/08/08", "time": "19시 21분 33초", "dateTime": "2019/08/08 19시 21분 33초"}
 *
 * serialize to (response body)
 * {"date": "2019-08-08", "time": "19:21:33", "dateTime": "2019-08-08T19:21:33"}
 * */
class LocalDateTimeDTO3(
    date: LocalDate?,
    time: LocalTime?,
    dateTime: LocalDateTime?
) {
    var date = date
        @JsonFormat(pattern = "yyyy-MM-dd") get
        @JsonFormat(pattern = "yyyy/MM/dd") set
    var time = time
        @JsonFormat(pattern = "HH:mm:ss") get
        @JsonFormat(pattern = "HH시 mm분 ss초") set
    var dateTime = dateTime
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss") get
        @JsonFormat(pattern = "yyyy/MM/dd HH시 mm분 ss초") set
}