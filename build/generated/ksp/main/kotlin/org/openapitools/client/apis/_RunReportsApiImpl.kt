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
import kotlin.Boolean
import kotlin.OptIn
import kotlin.String
import kotlin.Suppress
import kotlin.collections.List
import org.openapitools.client.models.ReportExportType
import org.openapitools.client.models.RunReportsResponse

@OptIn(InternalKtorfitApi::class)
public class _RunReportsApiImpl(
  private val _ktorfit: Ktorfit,
) : RunReportsApi {
  private val _helper: KtorfitConverterHelper = KtorfitConverterHelper(_ktorfit)

  override suspend fun retrieveAllAvailableExports(reportName: String,
      isSelfServiceUserReport: Boolean?): List<ReportExportType> {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl +
            "v1/runreports/availableExports/${"$reportName".encodeURLPath()}")
        isSelfServiceUserReport?.let{ parameter("isSelfServiceUserReport", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<List<ReportExportType>>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }

  override suspend fun runReport(reportName: String, isSelfServiceUserReport: Boolean?):
      RunReportsResponse {
    val _ext: HttpRequestBuilder.() -> Unit = {
        method = HttpMethod.parse("GET")
        url{
        takeFrom(_ktorfit.baseUrl + "v1/runreports/${"$reportName".encodeURLPath()}")
        isSelfServiceUserReport?.let{ parameter("isSelfServiceUserReport", "$it") }
        } 
        }
    val _typeData = TypeData.createTypeData(
    typeInfo = typeInfo<RunReportsResponse>(),
    )
    return _helper.suspendRequest(_typeData,_ext)!!
  }
}

public class _RunReportsApiProvider : ClassProvider<RunReportsApi> {
  override fun create(_ktorfit: Ktorfit): RunReportsApi = _RunReportsApiImpl(_ktorfit)
}

public fun Ktorfit.createRunReportsApi(): RunReportsApi = _RunReportsApiImpl(this)
