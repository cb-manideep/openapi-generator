/**
* OpenAPI Petstore
* This is a sample server Petstore server. For this sample, you can use the api key `special-key` to test the authorization filters.
*
* The version of the OpenAPI document: 1.0.0
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.client.models

import org.openapitools.client.models.Category
import org.openapitools.client.models.Tag

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * A pet for sale in the pet store
 * @param name 
 * @param photoUrls 
 * @param id 
 * @param category 
 * @param tags 
 * @param status pet status in the store
 */

data class Pet (
    @field:JsonProperty("name")
    val name: kotlin.String,
    @field:JsonProperty("photoUrls")
    val photoUrls: kotlin.collections.List<kotlin.String>,
    @field:JsonProperty("id")
    val id: kotlin.Long? = null,
    @field:JsonProperty("category")
    val category: Category? = null,
    @field:JsonProperty("tags")
    val tags: kotlin.collections.List<Tag>? = null,
    /* pet status in the store */
    @field:JsonProperty("status")
    val status: Pet.Status? = null
) {

    /**
     * pet status in the store
     * Values: AVAILABLE,PENDING,SOLD
     */
    enum class Status(val value: kotlin.String) {
        @JsonProperty(value = "available") AVAILABLE("available"),
        @JsonProperty(value = "pending") PENDING("pending"),
        @JsonProperty(value = "sold") SOLD("sold");
    }
}

