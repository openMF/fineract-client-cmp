// Generated by Ktorfit
@file:Suppress("warnings")

package org.openapitools.client.apis

import de.jensklingenberg.ktorfit.Ktorfit
import de.jensklingenberg.ktorfit.`internal`.ClassProvider
import de.jensklingenberg.ktorfit.`internal`.InternalKtorfitApi
import de.jensklingenberg.ktorfit.`internal`.KtorfitConverterHelper
import de.jensklingenberg.ktorfit.converter.TypeData
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.headers
import io.ktor.client.request.parameter
import io.ktor.client.request.setBody
import io.ktor.http.HttpMethod
import io.ktor.http.URLBuilder
import io.ktor.http.decodeURLQueryComponent
import io.ktor.http.encodeURLPath
import io.ktor.http.takeFrom
import io.ktor.util.reflect.typeInfo
import kotlin.Long
import kotlin.OptIn
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import org.openapitools.client.models.Scorecard
import org.openapitools.client.models.ScorecardData

@OptIn(InternalKtorfitApi::class)
public class _ScoreCardApiImpl(
  private val _ktorfit: Ktorfit,
) : ScoreCardApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun createScorecard1(surveyId: Long, scorecardData: ScorecardData?) {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("POST")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/surveys/scorecards/${"$surveyId".encodeURLPath()}")
        }
        setBody(scorecardData) 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<Unit>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun findByClient1(clientId: Long): List<ScorecardData> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/surveys/scorecards/clients/${"$clientId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<ScorecardData>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun findBySurvey(surveyId: Long): List<Scorecard> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/surveys/scorecards/${"$surveyId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<Scorecard>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun findBySurveyAndClient(surveyId: Long, clientId: Long): List<ScorecardData> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/surveys/scorecards/${"$surveyId".encodeURLPath()}/clients/${"$clientId".encodeURLPath()}")
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<ScorecardData>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _ScoreCardApiProvider : ClassProvider<ScoreCardApi> {
  override fun create(_ktorfit: Ktorfit): ScoreCardApi = _ScoreCardApiImpl(_ktorfit)
}

public fun Ktorfit.createScoreCardApi(): ScoreCardApi = _ScoreCardApiImpl(this)
