# Fineract Client KMP

[![Maven Central](https://img.shields.io/maven-central/v/io.github.niyajali/fineract-client-kmp.svg)](https://central.sonatype.com/artifact/io.github.niyajali/fineract-client-kmp)
[![License: MPL 2.0](https://img.shields.io/badge/License-MPL%202.0-brightgreen.svg)](https://opensource.org/licenses/MPL-2.0)
![Kotlin](https://img.shields.io/badge/Kotlin-Multiplatform-purple?logo=kotlin)

---

## 📌 Table of Contents

- [Overview](#overview)
- [Installation](#installation)
- [Architecture](#architecture)
- [Core Components](#core-components)
- [Builder Configuration](#builder-configuration)
- [Usage Examples](#usage-examples)
- [Working With Endpoints](#working-with-endpoints)
- [Date Formatting](#date-formatting)
- [Thread Safety](#thread-safety)
- [Best Practices](#best-practices)
- [Dependencies](#dependencies)
- [License](#license)

---

## 📌 Overview

The `FineractClient` is a Kotlin Multiplatform (KMP) client library for interacting with **Apache Fineract's REST APIs**.  
It provides a clean, type-safe wrapper around **Ktorfit**, simplifying integration with mobile and server-side applications.  

Key features:

- Builder-based configuration  
- Type-safe API interfaces  
- Multi-tenant support  
- Customizable HTTP client for authentication, logging, and serialization  

---

## 📦 Installation

### **Gradle (Kotlin DSL)**

```kotlin
implementation("io.github.niyajali:fineract-client-kmp:1.0.6")
```

---

## 🧱 Architecture

The client uses:

- **Builder Pattern:** flexible configuration for base URL, tenant, HTTP client, SSL settings.  
- **Ktorfit Integration:** generates Kotlin interfaces for Fineract endpoints.  

---

## 🔧 Core Components

### **FineractClient Class**

```kotlin
class FineractClient private constructor(
    private val ktorfit: Ktorfit,
) {
    val accountingClosures = ktorfit.createAccountingClosureApi()
    val accountingRules = ktorfit.createAccountingRulesApi()
    val accountNumberFormats = ktorfit.createAccountNumberFormatApi()
    val accountTransfers = ktorfit.createAccountTransfersApi()

    fun baseURL(): String
    fun httpClient(): HttpClient
}
```

### **Available API Endpoints**

- `accountingClosures` – Manage accounting period closures  
- `accountingRules` – Configure rules  
- `accountNumberFormats` – Define formatting patterns  
- `accountTransfers` – Perform account-to-account transfers  

---

## 🔨 Builder Configuration

```kotlin
class Builder internal constructor() {
    fun baseURL(baseURL: String): Builder
    fun tenant(tenant: String?): Builder
    fun httpClient(httpClient: HttpClient): Builder
    @Deprecated
    fun inSecure(insecure: Boolean): Builder
    fun build(): FineractClient
}
```

---

## 🚀 Usage Examples

### **Basic Client Setup**

```kotlin
val httpClient = HttpClient(CIO) {
    install(ContentNegotiation) { json() }
    install(Auth) {
        basic {
            credentials { BasicAuthCredentials(username = "admin", password = "password") }
        }
    }
}

val fineractClient = FineractClient.builder()
    .baseURL("https://your-fineract-server.com/fineract-provider/api/v1")
    .tenant("default")
    .httpClient(httpClient)
    .build()
```

---

### **Advanced HTTP Client Configuration**

```kotlin
val customHttpClient = HttpClient(CIO) {
    install(ContentNegotiation) { json(Json { ignoreUnknownKeys = true }) }
    install(Auth) { bearer { loadTokens { BearerTokens("token", "refresh") } } }
    install(Logging) { level = LogLevel.INFO }
    install(HttpTimeout) { requestTimeoutMillis = 30000; connectTimeoutMillis = 10000 }
}

val client = FineractClient.builder()
    .baseURL("https://your-fineract-server.com/fineract-provider/api/v1")
    .tenant("production")
    .httpClient(customHttpClient)
    .build()
```

---

## 🔢 Working With Endpoints

### **Accounting Closures**

```kotlin
val closures = client.accountingClosures.getAllClosures()
```

### **Account Transfers**

```kotlin
val transfer = client.accountTransfers.create(transferRequest)
```

---

## 📅 Date Formatting

Use the built-in constant for consistent formatting:

```kotlin
val formatted = LocalDate.now().format(DateTimeFormatter.ofPattern(FineractClient.DATE_FORMAT))
```

---

## 🧵 Thread Safety

`FineractClient` and its underlying `HttpClient` are **coroutine-safe** and can be used concurrently across threads.

---

## 🔐 Best Practices

1. Reuse `FineractClient` instances  
2. Configure proper authentication  
3. Handle API and network exceptions  
4. Use `FineractClient.DATE_FORMAT` for consistency  
5. Close `HttpClient` resources properly  
6. Avoid deprecated `inSecure` option  

---

## 📚 Dependencies

```kotlin
implementation("io.ktor:ktor-client-core:$ktor_version")
implementation("io.ktor:ktor-client-cio:$ktor_version")
implementation("io.ktor:ktor-client-auth:$ktor_version")
implementation("io.ktor:ktor-client-content-negotiation:$ktor_version")
implementation("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")
implementation("de.jensklingenberg.ktorfit:ktorfit-lib:$ktorfit_version")
```

---

## 📄 License

This project is licensed under the **Mozilla Public License 2.0 (MPL-2.0)**.  
See [LICENSE](https://opensource.org/licenses/MPL-2.0) for details.
