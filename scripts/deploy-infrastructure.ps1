$suffix = "psisss"
$resourceGroupName = "devops-lab-rg-" + $suffix
$appServicePlanName = "github-actions-asp"
$webAppName = "github-actions-" + $suffix
$acrName = "devopslab" + $suffix
$location = "eastasia"

# Create a resource group
az group create `
  --name $resourceGroupName `
  --location $location

# Create an App Service Plan
az appservice plan create `
    --resource-group $resourceGroupName `
    --name $appServicePlanName `
    --sku B3 `
    --is-linux

# Create Azure Web App with NGINX container
az webapp create `
    --resource-group $resourcegroupName `
    --plan $appServicePlanName `
    --name $webappName `
    --deployment-container-image-name nginx

# Create an Azure Container Registry
az acr create `
  --resource-group $resourceGroupName `
  --name $acrName `
  --sku basic `
  --admin-enabled true


