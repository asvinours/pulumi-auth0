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
    public sealed class ClientAddonsSamlp
    {
        /// <summary>
        /// String. Audience of the SAML Assertion. Default will be the Issuer on SAMLRequest.
        /// </summary>
        public readonly string? Audience;
        /// <summary>
        /// String. Class reference of the authentication context.
        /// </summary>
        public readonly string? AuthnContextClassRef;
        /// <summary>
        /// String. Protocol binding used for SAML logout responses.
        /// </summary>
        public readonly string? Binding;
        /// <summary>
        /// Boolean, (Default=true) Indicates whether or not a UPN claim should be created.
        /// </summary>
        public readonly bool? CreateUpnClaim;
        /// <summary>
        /// String. Destination of the SAML Response. If not specified, it will be AssertionConsumerUrlof SAMLRequest or Callback URL if there was no SAMLRequest.
        /// </summary>
        public readonly string? Destination;
        /// <summary>
        /// String, (Default=`sha1`). Algorithm used to calculate the digest of the SAML Assertion or response. Options include `defaultsha1` and `sha256`.
        /// </summary>
        public readonly string? DigestAlgorithm;
        /// <summary>
        /// Boolean,(Default=true). Indicates whether or not we should infer the NameFormat based on the attribute name. If set to false, the attribute NameFormat is not set in the assertion.
        /// </summary>
        public readonly bool? IncludeAttributeNameFormat;
        /// <summary>
        /// Integer, (Default=3600). Number of seconds during which the token is valid.
        /// </summary>
        public readonly int? LifetimeInSeconds;
        /// <summary>
        /// Map(Resource). Configuration settings for logout. For details, see Logout.
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Logout;
        /// <summary>
        /// Boolean, (Default=true). Indicates whether or not to add additional identity information in the token, such as the provider used and the access_token, if available.
        /// </summary>
        public readonly bool? MapIdentities;
        /// <summary>
        /// Boolean, (Default=false). Indicates whether or not to add a prefix of `http://schema.auth0.com` to any claims that are not mapped to the common profile when passed through in the output assertion.
        /// </summary>
        public readonly bool? MapUnknownClaimsAsIs;
        /// <summary>
        /// Map(String). Mappings between the Auth0 user profile property name (`name`) and the output attributes on the SAML attribute in the assertion (`value`).
        /// </summary>
        public readonly ImmutableDictionary<string, object>? Mappings;
        /// <summary>
        /// String, (Default=`urn:oasis:names:tc:SAML:1.1:nameid-format:unspecified`). Format of the name identifier.
        /// </summary>
        public readonly string? NameIdentifierFormat;
        /// <summary>
        /// List(String). Attributes that can be used for Subject/NameID. Auth0 will try each of the attributes of this array in order and use the first value it finds.
        /// </summary>
        public readonly ImmutableArray<string> NameIdentifierProbes;
        /// <summary>
        /// Boolean, (Default=true). Indicates whether or not to passthrough claims that are not mapped to the common profile in the output assertion.
        /// </summary>
        public readonly bool? PassthroughClaimsWithNoMapping;
        /// <summary>
        /// String. Recipient of the SAML Assertion (SubjectConfirmationData). Default is AssertionConsumerUrl on SAMLRequest or Callback URL if no SAMLRequest was sent.
        /// </summary>
        public readonly string? Recipient;
        /// <summary>
        /// Boolean. Indicates whether or not the SAML Response should be signed instead of the SAML Assertion.
        /// </summary>
        public readonly bool? SignResponse;
        /// <summary>
        /// String, (Default=`rsa-sha1`). Algorithm used to sign the SAML Assertion or response. Options include `rsa-sha1` and `rsa-sha256`.
        /// </summary>
        public readonly string? SignatureAlgorithm;
        /// <summary>
        /// String. Optionally indicates the public key certificate used to validate SAML requests. If set, SAML requests will be required to be signed. A sample value would be `-----BEGIN PUBLIC KEY-----\nMIGf...bpP/t3\n+JGNGIRMj1hF1rnb6QIDAQAB\n-----END PUBLIC KEY-----\n`.
        /// </summary>
        public readonly string? SigningCert;
        /// <summary>
        /// Boolean, (Default=true). Indicates whether or not we should infer the `xs:type` of the element. Types include `xs:string`, `xs:boolean`, `xs:double`, and `xs:anyType`. When set to false, all `xs:type` are `xs:anyType`.
        /// </summary>
        public readonly bool? TypedAttributes;

        [OutputConstructor]
        private ClientAddonsSamlp(
            string? audience,

            string? authnContextClassRef,

            string? binding,

            bool? createUpnClaim,

            string? destination,

            string? digestAlgorithm,

            bool? includeAttributeNameFormat,

            int? lifetimeInSeconds,

            ImmutableDictionary<string, object>? logout,

            bool? mapIdentities,

            bool? mapUnknownClaimsAsIs,

            ImmutableDictionary<string, object>? mappings,

            string? nameIdentifierFormat,

            ImmutableArray<string> nameIdentifierProbes,

            bool? passthroughClaimsWithNoMapping,

            string? recipient,

            bool? signResponse,

            string? signatureAlgorithm,

            string? signingCert,

            bool? typedAttributes)
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
