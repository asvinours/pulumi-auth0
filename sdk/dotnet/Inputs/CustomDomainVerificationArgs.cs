// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Auth0.Inputs
{

    public sealed class CustomDomainVerificationArgs : global::Pulumi.ResourceArgs
    {
        [Input("methods")]
        private InputList<object>? _methods;
        public InputList<object> Methods
        {
            get => _methods ?? (_methods = new InputList<object>());
            set => _methods = value;
        }

        public CustomDomainVerificationArgs()
        {
        }
        public static new CustomDomainVerificationArgs Empty => new CustomDomainVerificationArgs();
    }
}
