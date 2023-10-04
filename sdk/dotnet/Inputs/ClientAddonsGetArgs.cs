// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ClientAddonsGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS Addon configuration.
        /// </summary>
        [Input("aws")]
        public Input<Inputs.ClientAddonsAwsGetArgs>? Aws { get; set; }

        /// <summary>
        /// Azure Blob Storage Addon configuration.
        /// </summary>
        [Input("azureBlob")]
        public Input<Inputs.ClientAddonsAzureBlobGetArgs>? AzureBlob { get; set; }

        /// <summary>
        /// Azure Storage Bus Addon configuration.
        /// </summary>
        [Input("azureSb")]
        public Input<Inputs.ClientAddonsAzureSbGetArgs>? AzureSb { get; set; }

        /// <summary>
        /// Box SSO indicator (no configuration settings needed for Box SSO).
        /// </summary>
        [Input("box")]
        public Input<Inputs.ClientAddonsBoxGetArgs>? Box { get; set; }

        /// <summary>
        /// CloudBees SSO indicator (no configuration settings needed for CloudBees SSO).
        /// </summary>
        [Input("cloudbees")]
        public Input<Inputs.ClientAddonsCloudbeesGetArgs>? Cloudbees { get; set; }

        /// <summary>
        /// Concur SSO indicator (no configuration settings needed for Concur SSO).
        /// </summary>
        [Input("concur")]
        public Input<Inputs.ClientAddonsConcurGetArgs>? Concur { get; set; }

        /// <summary>
        /// Dropbox SSO indicator (no configuration settings needed for Dropbox SSO).
        /// </summary>
        [Input("dropbox")]
        public Input<Inputs.ClientAddonsDropboxGetArgs>? Dropbox { get; set; }

        /// <summary>
        /// Adobe EchoSign SSO configuration.
        /// </summary>
        [Input("echosign")]
        public Input<Inputs.ClientAddonsEchosignGetArgs>? Echosign { get; set; }

        /// <summary>
        /// Egnyte SSO configuration.
        /// </summary>
        [Input("egnyte")]
        public Input<Inputs.ClientAddonsEgnyteGetArgs>? Egnyte { get; set; }

        /// <summary>
        /// Google Firebase addon configuration.
        /// </summary>
        [Input("firebase")]
        public Input<Inputs.ClientAddonsFirebaseGetArgs>? Firebase { get; set; }

        /// <summary>
        /// Layer addon configuration.
        /// </summary>
        [Input("layer")]
        public Input<Inputs.ClientAddonsLayerGetArgs>? Layer { get; set; }

        /// <summary>
        /// Microsoft Dynamics CRM SSO configuration.
        /// </summary>
        [Input("mscrm")]
        public Input<Inputs.ClientAddonsMscrmGetArgs>? Mscrm { get; set; }

        /// <summary>
        /// New Relic SSO configuration.
        /// </summary>
        [Input("newrelic")]
        public Input<Inputs.ClientAddonsNewrelicGetArgs>? Newrelic { get; set; }

        /// <summary>
        /// Microsoft Office 365 SSO configuration.
        /// </summary>
        [Input("office365")]
        public Input<Inputs.ClientAddonsOffice365GetArgs>? Office365 { get; set; }

        /// <summary>
        /// Active Directory Rights Management Service SSO configuration.
        /// </summary>
        [Input("rms")]
        public Input<Inputs.ClientAddonsRmsGetArgs>? Rms { get; set; }

        /// <summary>
        /// Salesforce SSO configuration.
        /// </summary>
        [Input("salesforce")]
        public Input<Inputs.ClientAddonsSalesforceGetArgs>? Salesforce { get; set; }

        /// <summary>
        /// Salesforce API addon configuration.
        /// </summary>
        [Input("salesforceApi")]
        public Input<Inputs.ClientAddonsSalesforceApiGetArgs>? SalesforceApi { get; set; }

        /// <summary>
        /// Salesforce Sandbox addon configuration.
        /// </summary>
        [Input("salesforceSandboxApi")]
        public Input<Inputs.ClientAddonsSalesforceSandboxApiGetArgs>? SalesforceSandboxApi { get; set; }

        /// <summary>
        /// Configuration settings for a SAML add-on.
        /// </summary>
        [Input("samlp")]
        public Input<Inputs.ClientAddonsSamlpGetArgs>? Samlp { get; set; }

        /// <summary>
        /// SAP API addon configuration.
        /// </summary>
        [Input("sapApi")]
        public Input<Inputs.ClientAddonsSapApiGetArgs>? SapApi { get; set; }

        /// <summary>
        /// Sentry SSO configuration.
        /// </summary>
        [Input("sentry")]
        public Input<Inputs.ClientAddonsSentryGetArgs>? Sentry { get; set; }

        /// <summary>
        /// SharePoint SSO configuration.
        /// </summary>
        [Input("sharepoint")]
        public Input<Inputs.ClientAddonsSharepointGetArgs>? Sharepoint { get; set; }

        /// <summary>
        /// Slack team or workspace name usually first segment in your Slack URL, for example `https://acme-org.slack.com` would be `acme-org`.
        /// </summary>
        [Input("slack")]
        public Input<Inputs.ClientAddonsSlackGetArgs>? Slack { get; set; }

        /// <summary>
        /// SpringCM SSO configuration.
        /// </summary>
        [Input("springcm")]
        public Input<Inputs.ClientAddonsSpringcmGetArgs>? Springcm { get; set; }

        /// <summary>
        /// Generic SSO configuration.
        /// </summary>
        [Input("ssoIntegration")]
        public Input<Inputs.ClientAddonsSsoIntegrationGetArgs>? SsoIntegration { get; set; }

        /// <summary>
        /// Windows Azure Mobile Services addon configuration.
        /// </summary>
        [Input("wams")]
        public Input<Inputs.ClientAddonsWamsGetArgs>? Wams { get; set; }

        /// <summary>
        /// WS-Fed (WIF) addon indicator. Actual configuration is stored in `callback` and `client_aliases` properties on the client.
        /// </summary>
        [Input("wsfed")]
        public Input<Inputs.ClientAddonsWsfedGetArgs>? Wsfed { get; set; }

        /// <summary>
        /// Zendesk SSO configuration.
        /// </summary>
        [Input("zendesk")]
        public Input<Inputs.ClientAddonsZendeskGetArgs>? Zendesk { get; set; }

        /// <summary>
        /// Zoom SSO configuration.
        /// </summary>
        [Input("zoom")]
        public Input<Inputs.ClientAddonsZoomGetArgs>? Zoom { get; set; }

        public ClientAddonsGetArgs()
        {
        }
        public static new ClientAddonsGetArgs Empty => new ClientAddonsGetArgs();
    }
}
