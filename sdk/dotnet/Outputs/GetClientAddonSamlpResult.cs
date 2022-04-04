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
    public sealed class GetClientAddonSamlpResult
    {
        public readonly string Audience;
        public readonly string AuthnContextClassRef;
        public readonly string Binding;
        public readonly bool CreateUpnClaim;
        public readonly string Destination;
        public readonly string DigestAlgorithm;
        public readonly bool IncludeAttributeNameFormat;
        public readonly int LifetimeInSeconds;
        public readonly ImmutableDictionary<string, object> Logout;
        public readonly bool MapIdentities;
        public readonly bool MapUnknownClaimsAsIs;
        public readonly ImmutableDictionary<string, object> Mappings;
        public readonly string NameIdentifierFormat;
        public readonly ImmutableArray<string> NameIdentifierProbes;
        public readonly bool PassthroughClaimsWithNoMapping;
        public readonly string Recipient;
        public readonly bool SignResponse;
        public readonly string SignatureAlgorithm;
        public readonly string SigningCert;
        public readonly bool TypedAttributes;

        [OutputConstructor]
        private GetClientAddonSamlpResult(
            string audience,

            string authnContextClassRef,

            string binding,

            bool createUpnClaim,

            string destination,

            string digestAlgorithm,

            bool includeAttributeNameFormat,

            int lifetimeInSeconds,

            ImmutableDictionary<string, object> logout,

            bool mapIdentities,

            bool mapUnknownClaimsAsIs,

            ImmutableDictionary<string, object> mappings,

            string nameIdentifierFormat,

            ImmutableArray<string> nameIdentifierProbes,

            bool passthroughClaimsWithNoMapping,

            string recipient,

            bool signResponse,

            string signatureAlgorithm,

            string signingCert,

            bool typedAttributes)
        {
            Audience = audience;
            AuthnContextClassRef = authnContextClassRef;
            Binding = binding;
            CreateUpnClaim = createUpnClaim;
            Destination = destination;
            DigestAlgorithm = digestAlgorithm;
            IncludeAttributeNameFormat = includeAttributeNameFormat;
            LifetimeInSeconds = lifetimeInSeconds;
            Logout = logout;
            MapIdentities = mapIdentities;
            MapUnknownClaimsAsIs = mapUnknownClaimsAsIs;
            Mappings = mappings;
            NameIdentifierFormat = nameIdentifierFormat;
            NameIdentifierProbes = nameIdentifierProbes;
            PassthroughClaimsWithNoMapping = passthroughClaimsWithNoMapping;
            Recipient = recipient;
            SignResponse = signResponse;
            SignatureAlgorithm = signatureAlgorithm;
            SigningCert = signingCert;
            TypedAttributes = typedAttributes;
        }
    }
}
