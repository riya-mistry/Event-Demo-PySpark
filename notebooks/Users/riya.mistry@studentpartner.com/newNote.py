# Databricks notebook source
df = spark.read.csv("/mnt/folder4/covid_19_data.csv", header= True, inferSchema = True)

# COMMAND ----------

display(df)

# COMMAND ----------

df = df.withColumn("total", df.Deaths + df.Recovered)

# COMMAND ----------

df = df.withColumnRenamed( "Recovered",'GoodCondition')
display(df)

# COMMAND ----------

df.createOrReplaceTempView("corona")

# COMMAND ----------

# MAGIC %sql
# MAGIC select * from corona

# COMMAND ----------

# MAGIC %sql
# MAGIC select sum(total) from corona 

# COMMAND ----------

