// Databricks notebook source
val containerName = "folder1"
val storageAccountName = "riyastorage1234"
val sas = "sp=r&st=2020-05-21T09:26:29Z&se=2020-05-21T17:26:29Z&spr=https&sv=2019-10-10&sr=b&sig=fqoiVEqJTZE2cCp6ZJmefpiR%2BI4KCj0DFD6LsChJCAM%3D"
val url = "wasbs://" + containerName +"@" + storageAccountName + ".blob.core.windows.net/" 
var config = "fs.azure.sas." + containerName +"." +storageAccountName  + ".blob.core.windows.net"


// COMMAND ----------

dbutils.fs.mount(
  source = url,
  mountPoint = "/mnt/folder4/",
  extraConfigs  = Map(config -> sas))


// COMMAND ----------

