// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class GlobalClientAddonsSamlpGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("audience")]
        public Input<string>? Audience { get; set; }

        [Input("authnContextClassRef")]
        public Input<string>? AuthnContextClassRef { get; set; }

        [Input("binding")]
        public Input<string>? Binding { get; set; }

        [Input("createUpnClaim")]
        public Input<bool>? CreateUpnClaim { get; set; }

        [Input("destination")]
        public Input<string>? Destination { get; set; }

        [Input("digestAlgorithm")]
        public Input<string>? DigestAlgorithm { get; set; }

        [Input("includeAttributeNameFormat")]
        public Input<bool>? IncludeAttributeNameFormat { get; set; }

        [Input("issuer")]
        public Input<string>? Issuer { get; set; }

        [Input("lifetimeInSeconds")]
        public Input<int>? LifetimeInSeconds { get; set; }

        [Input("logout")]
        private InputMap<object>? _logout;
        public InputMap<object> Logout
        {
            get => _logout ?? (_logout = new InputMap<object>());
            set => _logout = value;
        }

        [Input("mapIdentities")]
        public Input<bool>? MapIdentities { get; set; }

        [Input("mapUnknownClaimsAsIs")]
        public Input<bool>? MapUnknownClaimsAsIs { get; set; }

        [Input("mappings")]
        private InputMap<object>? _mappings;
        public InputMap<object> Mappings
        {
            get => _mappings ?? (_mappings = new InputMap<object>());
            set => _mappings = value;
        }

        [Input("nameIdentifierFormat")]
        public Input<string>? NameIdentifierFormat { get; set; }

        [Input("nameIdentifierProbes")]
        private InputList<string>? _nameIdentifierProbes;
        public InputList<string> NameIdentifierProbes
        {
            get => _nameIdentifierProbes ?? (_nameIdentifierProbes = new InputList<string>());
            set => _nameIdentifierProbes = value;
        }

        [Input("passthroughClaimsWithNoMapping")]
        public Input<bool>? PassthroughClaimsWithNoMapping { get; set; }

        [Input("recipient")]
        public Input<string>? Recipient { get; set; }

        [Input("signResponse")]
        public Input<bool>? SignResponse { get; set; }

        [Input("signatureAlgorithm")]
        public Input<string>? SignatureAlgorithm { get; set; }

        [Input("signingCert")]
        public Input<string>? SigningCert { get; set; }

        [Input("typedAttributes")]
        public Input<bool>? TypedAttributes { get; set; }

        public GlobalClientAddonsSamlpGetArgs()
        {
        }
        public static new GlobalClientAddonsSamlpGetArgs Empty => new GlobalClientAddonsSamlpGetArgs();
    }
}
