// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class ConnectionOptionsGatewayAuthenticationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Audience claim for the HS256 token sent to `gateway_url`.
        /// </summary>
        [Input("audience")]
        public Input<string>? Audience { get; set; }

        /// <summary>
        /// Authentication method (default is `bearer` token).
        /// </summary>
        [Input("method")]
        public Input<string>? Method { get; set; }

        [Input("secret")]
        private Input<string>? _secret;

        /// <summary>
        /// Secret used to sign the HS256 token sent to `gateway_url`.
        /// </summary>
        public Input<string>? Secret
        {
            get => _secret;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _secret = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// Specifies whether or not the secret is Base64-encoded.
        /// </summary>
        [Input("secretBase64Encoded")]
        public Input<bool>? SecretBase64Encoded { get; set; }

        /// <summary>
        /// Subject claim for the HS256 token sent to `gateway_url`.
        /// </summary>
        [Input("subject")]
        public Input<string>? Subject { get; set; }

        public ConnectionOptionsGatewayAuthenticationArgs()
        {
        }
        public static new ConnectionOptionsGatewayAuthenticationArgs Empty => new ConnectionOptionsGatewayAuthenticationArgs();
    }
}
