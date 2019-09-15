package com.example.spring

import com.fasterxml.jackson.annotation.JsonFormat
import java.time.Instant
import java.time.OffsetDateTime
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter

/**
 * deserialize from (request body)
 * {"offsetDateTime": "2019-08-08T19:21:33+09:00", "zonedDateTime": "2019-08-08T19:21:33+09:00[Asia/Seoul]", "unixTime": 1568558972}
 *
 * serialize to (response body)
 * {"offsetDateTime": "2019-08-08T19:21:33+09:00", "zonedDateTime": "2019-08-08T19:21:33+09:00", "unixTime": "2019-09-15T14:49:32Z"}
 * */
data class ZonedDateTimeDTO(
    val offsetDateTime: OffsetDateTime?,
    val zonedDateTime: ZonedDateTime?,
    val unixTime: Instant?
)

/**
 * deserialize from (request body)
 * {"offsetDateTime": "2019/08/08 19시 21분 33초 +09:00", "zonedDateTime": "2019/08/08 19시 21분 33초 +09:00 [Asia/Seoul]", "unixTime": 1568558972}
 *
 * serialize to (response body)
 * {"offsetDateTime": "2019/08/08 19시 21분 33초 +09:00", "zonedDateTime": "2019/08/08 19시 21분 33초 +09:00 [KST]", "unixTime": "2019-09-15T14:49:32Z"}
 * */
data class ZonedDateTimeDTO2(
    @JsonFormat(pattern = "yyyy/MM/dd HH시 mm분 ss초 XXX") val offsetDateTime: OffsetDateTime?,
    @JsonFormat(pattern = "yyyy/MM/dd HH시 mm분 ss초 XXX '['z']'") val zonedDateTime: ZonedDateTime?,
    val unixTime: Instant?
)

/**
 * deserialize from (request body)
 * {"offsetDateTime": "2019/08/08 19시 21분 33초 +09:00", "zonedDateTime": "2019/08/08 19시 21분 33초 +09:00 [Asia/Seoul]", "unixTime": "2019/08/08 19시 21분 33초 +09:00"}
 *
 * serialize to (response body)
 * {"offsetDateTime": "2019-08-08T19:21:33+09:00", "zonedDateTime": "2019-08-08T19:21:33+09:00[KST]", "unixTime": 1565259693}
 * */
class ZonedDateTimeDTO3(
    offsetDateTime: OffsetDateTime?,
    zonedDateTime: ZonedDateTime?,
    unixTime: Instant?
) {
    var offsetDateTime = offsetDateTime
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX") get
        @JsonFormat(pattern = "yyyy/MM/dd HH시 mm분 ss초 XXX") set
    var zonedDateTime = zonedDateTime
        @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ssXXX'['z']'") get
        @JsonFormat(pattern = "yyyy/MM/dd HH시 mm분 ss초 XXX '['z']'") set
    var unixTime = unixTime
        @JsonFormat(pattern = "yyyy/MM/dd HH시 mm분 ss초 XXX") set

    fun getUnixTime() = unixTime?.epochSecond
}