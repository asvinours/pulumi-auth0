// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Outputs
{

    [OutputType]
    public sealed class GetClientAddonSapApiResult
    {
        public readonly string ClientId;
        public readonly string NameIdentifierFormat;
        public readonly string Scope;
        public readonly string ServicePassword;
        public readonly string TokenEndpointUrl;
        public readonly string UsernameAttribute;

        [OutputConstructor]
        private GetClientAddonSapApiResult(
            string clientId,

            string nameIdentifierFormat,

            string scope,

            string servicePassword,

            string tokenEndpointUrl,

            string usernameAttribute)
        {
            ClientId = clientId;
            NameIdentifierFormat = nameIdentifierFormat;
            Scope = scope;
            ServicePassword = servicePassword;
            TokenEndpointUrl = tokenEndpointUrl;
            UsernameAttribute = usernameAttribute;
        }
    }
}
